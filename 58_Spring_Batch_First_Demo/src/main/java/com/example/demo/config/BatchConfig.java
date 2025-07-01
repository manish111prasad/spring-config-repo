package com.example.demo.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.repeat.policy.SimpleCompletionPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.example.demo.entity.Customers;
import com.example.demo.repository.CustomerRepository;


@Configuration
@EnableBatchProcessing
public class BatchConfig {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	
    // item reader bean
    @Bean
    public FlatFileItemReader<Customers> customerReader() {

        FlatFileItemReader<Customers> itemReader = new FlatFileItemReader<>();

        // telling the path of the csv file.
        itemReader.setResource(new FileSystemResource("src/main/resources/customers_1000.csv"));

        // we can set the name for the itemReader, optional
        itemReader.setName("customer-item-read");

        // while reading the data, skip the first line, because, first line is the name of the row
        itemReader.setLinesToSkip(1);

        // read every line and each line will represent as customer object.
        itemReader.setLineMapper(lineMapper());

        return itemReader;
    }

    // line mapper bean
    @Bean
    public LineMapper<Customers> lineMapper() {

        DefaultLineMapper<Customers> lineMapper = new DefaultLineMapper<Customers>();

        // Read the data from the line and convert into customer object for that we use DELIMITER
        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();

        // every comma separates two fields, so we will tell Spring for the comma.
        lineTokenizer.setDelimiter(",");

        // if any space are missing, consider that as a space
        lineTokenizer.setStrict(false);

        // what are the field names that we are going to get
        lineTokenizer.setNames("id", "firstname", "lastname", "email", "gender", "contactNum", "country");

        // whatever the fields data we are getting from the csv, set that data to our customer object.
        BeanWrapperFieldSetMapper<Customers> fieldSetMapper = new BeanWrapperFieldSetMapper<Customers>();

        // In which class you want to store the data, --> Customer Class
        fieldSetMapper.setTargetType(Customers.class);

        // setting fieldSetMapper and lineTokenizer
        lineMapper.setFieldSetMapper(fieldSetMapper);
        lineMapper.setLineTokenizer(lineTokenizer);

        return lineMapper;
    }

    // item processor bean
    @Bean
    public CustomerProcessor customerProcessor() {
        return new CustomerProcessor();
    }

    // item writer bean
    @Bean
    public RepositoryItemWriter<Customers> customerWriter(){
		
    	//
    	RepositoryItemWriter<Customers> itemWriter = new RepositoryItemWriter<Customers>();
    	
    	//we need to specify what is our Repository which is used to write the data.
    	itemWriter.setRepository(customerRepository);
    	
    	//inside which method we save the data
    	itemWriter.setMethodName("save");
    	
    	return itemWriter;
    	
    	
    }
    
    
    
    
    // step bean --> It is used to return step objects.
    @Bean
    public Step step(StepBuilder stepBuilder) {
        return stepBuilder
                .<Customers, Customers>chunk(new SimpleCompletionPolicy(10))
                .reader(customerReader())
                .processor(customerProcessor())
                .writer(customerWriter())
                .build();
    
    
    
    
    
    // job bean
    
    @Bean
    public Job job(JobBuilder jobBuilder, Step step) {
        return jobBuilder
                .start(step)
                .build();
    }
    

}
