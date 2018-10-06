package com.jspiders.jc.bean;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //<bean class="FQCN"/> in spring.xml
public class Hospital {

	//@Value("MSR")
	String name;
	//@Value("100")
	private int numOfDoctors;
	//@Value("1000")
	int numOfBeds;
	
	/*public Hospital() {
		// TODO Auto-generated constructor stub
	}*/
	
	@Inject
	public Hospital(@Value("MSR") String name,@Value("1000") int numOfBeds) {
		this.name = name;
		this.numOfBeds = numOfBeds;
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	/*@Inject
	public Hospital(@Value("MSR") String name,
			@Value("1000") int numOfBeds, 
			@Value("100") int numOfDoctors) {
		super();
		this.name = name;
		this.numOfDoctors = numOfDoctors;
		this.numOfBeds = numOfBeds;
	}*/

	public int getNumOfDoctors() {
		return numOfDoctors;
	}

	@Value("100")
	public void setNumOfDoctors(int numOfDoctors) {
		this.numOfDoctors = numOfDoctors;
	}

	public void registerPatients() {
		System.out.println("Id card issued");
	}
	
	public void treatPatients() {
		System.out.println("Medicine prescribed");
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", numOfDoctors=" + numOfDoctors + ", numOfBeds=" + numOfBeds + "]";
	}
	
}
