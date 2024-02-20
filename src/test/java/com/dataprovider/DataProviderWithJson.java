package com.dataprovider;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataProviderWithJson {
	@Test
	public void testDPWithJson(Map<String, Object> map) {
		map.forEach((k, v) -> System.out.println(k + ":" + v));
	}

	@DataProvider
	public void getData() throws StreamReadException, DatabindException, IOException {

		List<Map<String, String>> a = new ObjectMapper().readValue(
				new File(System.getProperty("user.dir") + "/src/test/resources/jsons/config.json"),
				new com.fasterxml.jackson.core.type.TypeReference<List<Map<String, String>>>() {
				});
		Map<String, String> b = new ObjectMapper().readValue(
				new File(System.getProperty("user.dir") + "/src/test/resources/jsons/config2.json"),
				new com.fasterxml.jackson.core.type.TypeReference<Map<String, String>>() {
				});

	}

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		List<TestData> a = new ObjectMapper().readValue(
				new File(System.getProperty("user.dir") + "/src/test/resources/jsons/config.json"),
				new com.fasterxml.jackson.core.type.TypeReference<List<TestData>>() {
				});
		System.out.println(a);
		TestData b = new ObjectMapper().readValue(
				new File(System.getProperty("user.dir") + "/src/test/resources/jsons/config2.json"), TestData.class);
		System.out.println(b);
	}

}
