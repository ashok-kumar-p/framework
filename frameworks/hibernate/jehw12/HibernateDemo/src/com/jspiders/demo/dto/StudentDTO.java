package com.jspiders.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class StudentDTO implements Serializable {

	@Id
	@Column(name="s_id")
	private int id;
	@Column(name="s_name")
	private String name;
	@Column(name="s_age")
	private int age;
	@Column(name="s_phone_num")
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
