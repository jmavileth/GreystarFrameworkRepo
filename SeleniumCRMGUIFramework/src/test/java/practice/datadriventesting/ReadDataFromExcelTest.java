package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelTest {
	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("org");
		Row row = sh.getRow(1);
		String data = row.getCell(3).toString();
		String data1 = row.getCell(2).getStringCellValue();
		
		System.out.println(data+data1);
		wb.close();
	}

}
