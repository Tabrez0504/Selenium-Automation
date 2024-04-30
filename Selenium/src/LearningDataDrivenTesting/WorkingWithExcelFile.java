package LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fls = new FileInputStream("./Testdata/Book1.xlsx");
		
		//To access workbook
		Workbook book=WorkbookFactory.create(fls);
		
		//To access sheet
		Sheet sh = book.getSheet("Sheet1");
		
		//To access row
		Row row = sh.getRow(0);
		
		//To access cell
		Cell cell = row.getCell(0);
		
		
//		//In String Format
//		String value1 = cell.getStringCellValue();
//		System.out.println(value1);
//		
//		//In number format
//		double value2 = sh.getRow(1).getCell(0).getNumericCellValue();
//		System.out.println(value2);

		
		String value1=sh.getRow(0).getCell(0).toString();
		String value2=sh.getRow(1).getCell(0).toString();
		
		System.out.println(value1);
		System.out.println(value2);


	}

}
