package LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fls = new FileInputStream("./Testdata/Exampledata.xlsx");
		
		//To access workbook
		Workbook book=WorkbookFactory.create(fls);
		Sheet sh=book.getSheet("Sheet2");
		
		sh.createRow(0).createCell(0).setCellValue("Tabrez");
		sh.getRow(0).createCell(1).setCellValue("Shaikh");
		
		sh.createRow(1).createCell(0).setCellValue("Albert");
		sh.getRow(1).createCell(1).setCellValue("paul");

		FileOutputStream fos = new FileOutputStream("./Testdata/Exampledata.xlsx");
		book.write(fos);
		
		fos.flush();
		System.out.println("Done...");
	}

}
