package com.jspiders.crud.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="employee_details")
public class EmployeeDTO implements Serializable {

	@Id
	@GenericGenerator(name="myid",strategy="increment")
	@GeneratedValue(generator="myid")
	@Column(name="e_id")
	private int id;
	@Column(name="e_name")
	private String empName;
	@Column(name="e_email")
	private String empEmail;
	@Column(name="e_salary")
	private double salary;
	@Column(name="e_empid")
	private String empId;

	public EmployeeDTO() {
		System.out.println("EmployeeDTO object created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", empName=" + empName + ", empEmail=" + empEmail + ", salary=" + salary
				+ ", empId=" + empId + "]";
	}

}
