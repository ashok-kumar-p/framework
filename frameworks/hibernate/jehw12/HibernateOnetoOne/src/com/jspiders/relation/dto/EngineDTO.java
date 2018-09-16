package com.jspiders.relation.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="engine_details")
public class EngineDTO implements Serializable{

	@Id
	@GenericGenerator(name="eid",strategy="increment")
	@GeneratedValue(generator="eid")
	@Column(name="e_id")
	private int id;
	@Column(name="e_number")
	private String engNo;
	@Column(name="e_capacity")
	private int capacity;
	@Column(name="e_make_date")
	private String makeDate;
	@Column(name="e_manufacturer")
	private String manufacturerName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="airplane_id")
	private AirplaneDTO airplane;
	
	public EngineDTO() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEngNo() {
		return engNo;
	}

	public void setEngNo(String engNo) {
		this.engNo = engNo;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getMakeDate() {
		return makeDate;
	}

	public void setMakeDate(String makeDate) {
		this.makeDate = makeDate;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public AirplaneDTO getAirplane() {
		return airplane;
	}

	public void setAirplane(AirplaneDTO airplane) {
		this.airplane = airplane;
	}

	@Override
	public String toString() {
		return "EngineDTO [id=" + id + ", engNo=" + engNo + ", capacity=" + capacity + ", makeDate=" + makeDate
				+ ", manufacturerName=" + manufacturerName + "]";
	}
	
}
