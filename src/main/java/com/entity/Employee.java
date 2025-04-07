package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("1")
	private int emp_id;
	@Value("Vishal")
	private String name;
	@Value("Frontend Developer")
	private String domain;
	@Value("40000")
	private int salary;

	public Employee() {

	}

	public Employee(int emp_id, String name, String domain, int salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.domain = domain;
		this.salary = salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", domain=" + domain + ", salary=" + salary + "]";
	}

}
