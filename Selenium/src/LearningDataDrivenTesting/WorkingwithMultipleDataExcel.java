package LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingwithMultipleDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fls = new FileInputStream("./Testdata/Exampledata.xlsx");
		
		//To access workbook
		Workbook book=WorkbookFactory.create(fls);
		
		//To access sheet
		Sheet sh = book.getSheet("Sheet1");
		
		int lastRowNum = sh.getPhysicalNumberOfRows();
		
		int lastCellNum = sh.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(lastRowNum);
		System.out.println(lastCellNum);

		for(int i = 0; i < lastRowNum ; i++ )
		{
			for(int j= 0;j < lastCellNum; j++)
			{
			String value = sh.getRow(i).getCell(j).toString();
			System.out.print(value+" ");
		}
		System.out.println();
		}
	}

}
