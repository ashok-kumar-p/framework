package com.jspiders.lifecycle.bean;

public class Employee {

	public String empId;
	public long acctNum;
	public String managerName;
	
	public Employee() {
		System.out.println("Employee object created");
	}

	public void initDetails() {
		System.out.println("empId and AccNum initialised");
	}
	
	public void projectDetails() {
		System.out.println("Woking on Ecommerce application");
	}
	
	public void deactivateCredentials() {
		System.out.println("Employee's all access revoked");
	}
	
	public void sample() {
		System.out.println("Destroy again");
	}
}
