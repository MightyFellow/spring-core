package com.springcore.ci;

public class Certificate {
	private String name;

	public Certificate(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}

}
