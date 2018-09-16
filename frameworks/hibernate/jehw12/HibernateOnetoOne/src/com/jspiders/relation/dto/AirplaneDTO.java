package com.jspiders.relation.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "airplane_table")
public class AirplaneDTO implements Serializable {

	@Id
	@GenericGenerator(name = "aid", strategy = "increment")
	@GeneratedValue(generator = "aid")
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_flight_no")
	private String flightNo;
	@Column(name = "a_airline_name")
	private String airlineName;
	@Column(name = "a_no_seats")
	private int noOfSeats;
	@Column(name = "a_source")
	private String source;
	@Column(name = "a_destination")
	private String destination;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "airplane_id")
	List<EngineDTO> engineList;

	public AirplaneDTO() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<EngineDTO> getEngineList() {
		return engineList;
	}

	public void setEngineList(List<EngineDTO> engineList) {
		this.engineList = engineList;
	}

	@Override
	public String toString() {
		return "AirplaneDTO [id=" + id + ", flightNo=" + flightNo + ", airlineName=" + airlineName + ", noOfSeats="
				+ noOfSeats + ", source=" + source + ", destination=" + destination + "]";
	}

}
