package com.interviewProblems.filterEmployee;

import model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FilterEmployeeApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(FilterEmployeeApplication.class, args);

		//ToDo: find a way to assign values to applicationContext bean in AllArgsConstructor style
		Employee e1 = applicationContext.getBean(Employee.class);
		e1.setFirstName("FName1");
		e1.setLastName("LName1");
		e1.setSalary(50000.50F);
		e1.setDeptId((short)101);
		Employee e2 = applicationContext.getBean(Employee.class);
		Employee e3 = new Employee("FName2","LName2",45000F, (short)103);
		Employee e4 = new Employee("FName3","LName3",47000F, (short)105);
		Employee e5 = new Employee("FName4","LName4",44000F, (short)105);
		Employee e6 = new Employee("FName5","LName4",45000F, (short)107);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);

		List<Employee> sortedEmployees = employeeSorter(employees);
		sortedEmployees.forEach(System.out::println);
	}

	@Bean
	public Employee getBean(){
		return new Employee();
	}

	public static List<Employee> employeeSorter(List<Employee> employeeList){
		Comparator<Employee> salaryDesc = Comparator.comparing(Employee::getSalary);

		List<Employee> SortedEmployees = employeeList.stream()
				.filter(e->e.getDeptId()==(short) 105)
				.sorted(Collections.reverseOrder(salaryDesc))
				//.forEach(System.out::println); //Terminal operator which returns void,so no ops to be used after this
				.toList();
		return SortedEmployees;

	}
}
