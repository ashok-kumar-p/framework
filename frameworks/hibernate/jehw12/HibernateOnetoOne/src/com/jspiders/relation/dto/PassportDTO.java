package com.jspiders.relation.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="passport_details")
public class PassportDTO implements Serializable{

	@Id
	@GenericGenerator(name="id", strategy="increment")
	@GeneratedValue(generator="id")
	@Column(name="pp_id")
	private int id;
	@Column(name="pp_number")
	private String ppNum;
	@Column(name="pp_validity")
	private String validity;
	@Column(name="pp_birth_place")
	private String birthPlace;
	@Column(name="pp_nationality")
	private String nationality;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="person_id")
	private PersonDTO person;
	
	
	public PassportDTO() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPpNum() {
		return ppNum;
	}

	public void setPpNum(String ppNum) {
		this.ppNum = ppNum;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public PersonDTO getPerson() {
		return person;
	}

	public void setPerson(PersonDTO person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "PassportDTO [id=" + id + ", ppNum=" + ppNum + ", validity=" + validity + ", birthPlace=" + birthPlace
				+ ", nationality=" + nationality + "]";
	}
	
}
