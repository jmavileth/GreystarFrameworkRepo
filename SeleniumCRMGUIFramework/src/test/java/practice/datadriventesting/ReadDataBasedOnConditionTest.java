package practice.datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataBasedOnConditionTest {

	public static void main(String[] args) throws Throwable {
		boolean flag = true;
		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");
		String extectedTestID = "TC_02";
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("org");
		int lastRowCount = sh.getLastRowNum();
		for (int i = 1; i <= lastRowCount; i++) {
			if (flag == true)
				try {

					System.out.println(sh.getRow(i).getCell(0).toString());
					System.out.println(sh.getRow(i).getCell(1).toString());
				} catch (Exception e) {

				}
			else {
				System.out.println(extectedTestID+" not found");
			}

		}
		wb.close();
	}
}
