package com.greystar.crm.generic.fileUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getStringDataFromExcel(String sheetName, int rowNum, int cellNum) throws Throwable {
		/**
		 * Step 1: Get the excel path location and java object of physical Excel file
		 */
		FileInputStream fis = new FileInputStream("./configAppData/TestScriptData.xlsx");
		/**
		 * Step 2: Open workbook in read mode
		 */
		Workbook workbook = WorkbookFactory.create(fis);
		/**
		 * Step 3: Get control of the sheet, row, cell and read string data
		 */
		String data = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		/* chaining */
		/**
		 * Step 4: Close the workbook
		 */
		workbook.close();
		return data;

	}

//No Point of reading Numeric Data as Selenium sendkeys always takes String
	public int getNumericIntDataFromExcel(String sheetName, int rowNum, int cellNum) throws Throwable {
		/**
		 * Step 1: Get the excel path location and java object of physical Excel file
		 */
		FileInputStream fis = new FileInputStream("./configAppData/TestScriptData.xlsx");
		/**
		 * Step 2: Open workbook in read mode
		 */
		Workbook workbook = WorkbookFactory.create(fis);
		/**
		 * Step 3: Get control of the sheet, row, cell and read string data
		 */
		int data = (int) workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
		/* chaining */
		/**
		 * Step 4: Close the workbook
		 */
		workbook.close();
		return data;

	}

	public double getNumericDoubleDataFromExcel(String sheetName, int rowNum, int cellNum) throws Throwable {
		/**
		 * Step 1: Get the excel path location and java object of physical Excel file
		 */
		FileInputStream fis = new FileInputStream("./configAppData/TestScriptData.xlsx");
		/**
		 * Step 2: Open workbook in read mode
		 */
		Workbook workbook = WorkbookFactory.create(fis);
		/**
		 * Step 3: Get control of the sheet, row, cell and read string data
		 */
		double data = (double) workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
		/* chaining */
		/**
		 * Step 4: Close the workbook
		 */
		workbook.close();
		return data;

	}

	public int getRowCount(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream("./configAppData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		int rowCount = workbook.getSheet(sheetName).getLastRowNum();
		/* chaining */
		workbook.close();
		return rowCount;
	}

	public void setDataIntoExcel(String sheetName, int rowNum, int cellNum, String data) throws Throwable {
		/**
		 * Step 1: Get the excel path location and java object of physical Excel file in
		 * Read mode
		 */
		FileInputStream fis = new FileInputStream("./configAppData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		/**
		 * Step 3: Get control of the sheet, row, cell and read string data
		 */
		workbook.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(data);

		FileOutputStream fos = new FileOutputStream("./configAppData/TestScriptData.xlsx");
		workbook.write(fos);
		workbook.close();

	}

}
