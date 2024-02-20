package com.dataprovider;

import org.testng.annotations.DataProvider;

public class Employee {
	private String name;
	private String id;

	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
	@DataProvider
	public static Employee[] getData2() {
		return new Employee[] { new Employee("narasgonda", "123"), new Employee("khaja", "789") };
	}
}
