package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ConfigClass;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Employee e = context.getBean(Employee.class);
//		e.setEmp_id(101);
//		e.setName("Shubham");
//		e.setDomain("Java Developer");
//		e.setSalary(50000);
		
		System.out.println(e);

	}

}
