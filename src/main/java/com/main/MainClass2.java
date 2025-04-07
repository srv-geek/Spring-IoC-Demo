package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigClass;
import com.entity.Student;

public class MainClass2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		Student s = context.getBean(Student.class);
		System.out.println(s);
	}

}
