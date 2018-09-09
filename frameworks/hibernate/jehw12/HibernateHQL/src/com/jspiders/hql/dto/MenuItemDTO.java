package com.jspiders.hql.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="item_details")
public class MenuItemDTO implements Serializable {

	@Id
	@GenericGenerator(name="something",strategy="increment")
	@GeneratedValue(generator="something")
	@Column(name="i_id")
	private int id;
	@Column(name="i_name")
	private String name;
	@Column(name="i_price")
	private double price;
	@Column(name="i_type")
	private String type;
	@Column(name="i_code")
	private String code;

	public MenuItemDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "MenuItemDTO [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", code=" + code
				+ "]";
	}

}
