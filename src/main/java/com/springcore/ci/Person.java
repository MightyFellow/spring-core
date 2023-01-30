package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certificate certificate;
	private List<String> list;

	public Person(String name, int personId, Certificate certificate, List<String> list) {
		super();
		this.name = name;
		this.personId = personId;
		this.certificate = certificate;
		this.list = list;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.personId + " : " + this.name + "(" + this.certificate.getName() + ")" + "\n" + this.list;
	}

}
