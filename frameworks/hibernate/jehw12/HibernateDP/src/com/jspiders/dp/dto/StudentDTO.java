package com.jspiders.dp.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {

	private int id;
	private String name;
	private int age;
	private long phNum;

	public StudentDTO() {
		System.out.println("StudentDTO object created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhNum() {
		return phNum;
	}

	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", age=" + age + ", phNum=" + phNum + "]";
	}

}
