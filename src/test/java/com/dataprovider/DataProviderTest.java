package com.dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider = "getData1")
	public void test1(Employee emp) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}

	@Test(dataProvider = "getData1")
	public void test2(String username) {
		System.out.println(username);
	}

	@DataProvider
	public static Object[] getData1(Method m) {
		if (m.getName().equalsIgnoreCase("test1")) {

			return new Employee[] { new Employee("narasgonda", "123"), new Employee("khaja", "789") };

		} else if (m.getName().equalsIgnoreCase("test2")) {

			return new Object[] { "naresh", "testing mini bytes" };
		}
		return null;
	}
}
