package com.example.myapp.models;

import java.util.Date;

public class Product {
	private int id;
	private String name;
	private double price;
	private String manufacturer;
	private Date expiry;
	private String description;

	public Product(int id, String name, String description, double price, String manufacturer, Date expiry) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
		this.expiry = expiry;
		this.description = description;
		
	}

	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
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

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

}
