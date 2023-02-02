package com.springcore.auto.wire;

public class Employee {
	// byName annotation will check for reference name
	//byType annotation will check for the class Name or object type
	// Both the byName and byType will call the setter method
     private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
     
     
}
