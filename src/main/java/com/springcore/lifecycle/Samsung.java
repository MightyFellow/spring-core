package com.springcore.lifecycle;

public class Samsung {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samsung() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samsung [price=" + price + "]";
	}

	public void init() {
		System.out.println("inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
 }
