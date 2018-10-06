package com.jspiders.jc.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Event {

	@Value("Youth And Truth")
	public String name;
	@Value("India")
	public String place;
	@Value("2000")
	public int numOfAudience;
	@Value("Sadhguru")
	public String host;
	
	public Event() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	@Override
	public String toString() {
		return "Event [name=" + name + ", place=" + place + ", numOfAudience=" + numOfAudience + ", host=" + host + "]";
	}
	
	
}
