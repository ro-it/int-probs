package com.interviewProblems.filterEmployee;

import model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FilterEmployeeApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(FilterEmployeeApplication.class, args);
		//Employee e1 = applicationContext.getBean(Employee.class, "Fname1","Lname1",1000.00,101);
		Employee e2 = applicationContext.getBean(Employee.class);


		/*Employee e3 = applicationContext.getBean(Employee.class);
		Employee e4 = applicationContext.getBean(Employee.class);*/
		System.out.println(e2);
	}

	@Bean
	public Employee getBean(){
		return new Employee();
	}

}
