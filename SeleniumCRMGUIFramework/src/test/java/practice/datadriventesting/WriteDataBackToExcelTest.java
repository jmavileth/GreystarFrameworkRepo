package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataBackToExcelTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("org");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(4); 
		cell.setCellType(CellType.STRING);
		cell.setCellValue("Pass");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/TestScriptData.xlsx");
		wb.write(fos);
		wb.close();
		System.err.print("========Executed======");
		
		
		
		
		
		
		
		
	
	}

}
