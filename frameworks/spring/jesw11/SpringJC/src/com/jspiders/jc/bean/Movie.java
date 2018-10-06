package com.jspiders.jc.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Movie {

	@Value("Bahubali")
	String name;
	@Value("ARKA media")
	String productionName;
	@Value("Rajamouli")
	String director;
	@Value("3000000000")
	double budget;
	
	public Movie() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", productionName=" + productionName + ", director=" + director + ", budget="
				+ budget + "]";
	}
	
	
}
