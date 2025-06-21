package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@SpringBootApplication
public class SbmsRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SbmsRepositoryApplication.class, args);

		EmployeeRepository repository = ctxt.getBean(EmployeeRepository.class);

		/*
		 * Sort desc = Sort.by("empSalary", "empName").descending();
		 * 
		 * int sex = 1;
		 * 
		 * PageRequest page = PageRequest.of(sex - 1, 3);
		 * 
		 * Page<Employee> findAll = repository.findAll(page);
		 * 
		 * List<Employee> emps = findAll.getContent();
		 */

		// List<Employee> emps = repository.findAll(desc);

		Employee emp = new Employee();

		/*
		 * emp.setEmpGender("Male"); emp.setEmpName("Manish");
		 * 
		 * Example<Employee> empx = Example.of(emp);
		 * 
		 * List<Employee> emps = repository.findAll(empx);
		 * 
		 * emps.forEach(System.out::println);
		 */

		
		emp.setEmpName("prasad ");
		emp.setEmpGender("boy");
		emp.setDept("IIT");
		emp.setEmpSalary(1000000.00);

		repository.save(emp);

	}

}
