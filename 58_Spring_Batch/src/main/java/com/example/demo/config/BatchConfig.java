package com.example.demo.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	private CustomerRepository customRepo;

	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Bean
	public FlatFileItemReader<Customer> customReader() {

		FlatFileItemReader<Customer> itemReader = new FlatFileItemReader<>();

		itemReader.setResource(new FileSystemResource("src/main/resources/customers_1000.csv"));
		
		itemReader.setName("customer-item-reader");
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(lineMapper());

		return itemReader;
	}

	private LineMapper<Customer> lineMapper() {

		DefaultLineMapper<Customer> lineMapper = new DefaultLineMapper<>();

		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(",");
		lineTokenizer.setStrict(false);
		lineTokenizer.setNames("id", "firstname", "lastname", "email", "gender", "contactNum", "country");

		BeanWrapperFieldSetMapper<Customer> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(Customer.class);

		lineMapper.setFieldSetMapper(fieldSetMapper);
		lineMapper.setLineTokenizer(lineTokenizer);

		return lineMapper;
	}

	@Bean
	public CustomerProcessor customerProcess() {

		return new CustomerProcessor();

	}

	@Bean
	public RepositoryItemWriter<Customer> customerWriter() {

		RepositoryItemWriter<Customer> itemWriter = new RepositoryItemWriter<>();

		itemWriter.setRepository(customRepo);
		itemWriter.setMethodName("save");

		return itemWriter;

	}

	@Bean
	public Step step() {

		return stepBuilderFactory.get("step-1").<Customer, Customer>chunk(10).reader(customReader())
				.processor(customerProcess()).writer(customerWriter()).build();

	}

	@Bean
	public Job job() {

		return jobBuilderFactory.get("customer-import").flow(step()).end().build();

	}

}
