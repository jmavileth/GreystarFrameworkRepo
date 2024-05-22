package practice.datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcelTest {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");

	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("mobile");
	int lastRowNum = sh.getLastRowNum();
	for (int i = 1; i <= lastRowNum; i++) {
		Row row = sh.getRow(i);
		String c1Data = row.getCell(0).toString();
		String c2Data = row.getCell(1).toString();
		System.out.println(c1Data+"  "+c2Data);
	}
	wb.close();
}
}
