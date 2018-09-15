package com.jspiders.relation.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="person_details")
public class PersonDTO implements Serializable {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GenericGenerator(name="someid", strategy="increment")
	@GeneratedValue(generator="someid")
	@Column(name="p_id")
	private int id;
	@Column(name="p_name")
	private String name;
	@Column(name="p_phone_num")
	private long phNum;
	@Column(name="p_age")
	private int age;
	@Column(name="p_city")
	private String city;

	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private PassportDTO passport;
	
	public PersonDTO() {
		System.out.println(this.getClass().getSimpleName() + " create");
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

	public long getPhNum() {
		return phNum;
	}

	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public PassportDTO getPassport() {
		return passport;
	}

	public void setPassport(PassportDTO passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", name=" + name + ", phNum=" + phNum + ", age=" + age + ", city=" + city + "]";
	}

}
