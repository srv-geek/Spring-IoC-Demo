package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Student;

@Configuration("com.entity")
public class MyConfigClass {

	@Bean
	public Student stdobj() {
		return new Student();
	}
	
}
