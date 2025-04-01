package seleniumsection3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFilePractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//	FileInputStream fis=new FileInputStream("C:\\Users\\Arun\\Desktop\\Animal.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sh=wb.getSheet("Fish");
//		Row r=sh.getRow(2);
//		Cell c=r.getCell(2);
//	//	String value=c.getStringCellValue();
//		DataFormatter df=new DataFormatter();
//		String value=df.formatCellValue(c);
		ExcelUtility eUtil=new ExcelUtility();
		String value= eUtil.getDataFromExcelFile("Animal",0, 1);
		String value1=eUtil.getDataFromExcelFile("Bird", 4, 0);
		String value2=eUtil.getDataFromExcelFile("Fish", 2, 1);
		String value3=eUtil.getDataFromExcelFile("Fish", 3, 3);
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}
