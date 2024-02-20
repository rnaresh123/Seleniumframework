package com.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {
	@Test(dataProvider = "getData")
	public void test2(Map<String, String> map) {
		System.out.println(map.get("username"));
	}

	@DataProvider
	public Object[] getData() throws IOException {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/excel/testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("testing");

		int rownum = sheet.getLastRowNum();
		System.out.println(rownum);
		int colomnnum = sheet.getRow(0).getLastCellNum();
		System.out.println(colomnnum);

		Object[] data = new Object[rownum];
		Map<String, String> map;
		for (int i = 1; i <= rownum; i++) {
			map = new HashMap<>();
			for (int j = 0; j <colomnnum; j++) {
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
				data[i - 1] = map;
				// data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();

			}
		}
		return data;
	}

}
