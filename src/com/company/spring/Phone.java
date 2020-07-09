package com.company.spring;

import java.math.BigDecimal;

public class Phone {
	private String brand;
	private BigDecimal price;
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	public Phone(String brand, BigDecimal price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", price=" + price + "]";
	}
	
}
