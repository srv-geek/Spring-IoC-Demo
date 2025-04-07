package com.entity;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("11907066")
	private int s_id;
	@Value("Shubham")
	private String name;
	@Value("Pune")
	private String city;

	public Student() {
	}

	public Student(int s_id, String name, String city) {
		super();
		this.s_id = s_id;
		this.name = name;
		this.city = city;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", name=" + name + ", city=" + city + "]";
	}

}
