package com.jspiders.jc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookMyShow {

	@Value("10000")
	public int numOfEmployee;
	@Value("MR.Ganesh")
	public String ceoName;
	
	//@Autowired
	public Movie movie;
	
	private Event event;

	public BookMyShow() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	@Autowired
	public BookMyShow(Movie movie) {
		super();
		this.movie = movie;
	}

	public Event getEvent() {
		return event;
	}

	@Autowired
	public void setEvent(Event event) {
		this.event = event;
	}

	@Override
	public String toString() {
		
		return "BookMyShow [numOfEmployee=" + numOfEmployee + ", ceoName=" + ceoName + "]";
	}
	
	
}
