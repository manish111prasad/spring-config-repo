package in.IT.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.IT.AppConfig;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		reportService service = ctxt.getBean(reportService.class);
		service.generateReport();

	}

}
