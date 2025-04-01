package seleniumsection3;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;
import genericUtility.JavaUtility;

public class FetchingMultipleDataFromExcelFilePractice {

	public static void main(String[] args) throws Exception {
//		FileInputStream fis=new FileInputStream("C:\\Users\\Arun\\Desktop\\Animal.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sh=wb.getSheet("Animal");
//		DataFormatter df=new DataFormatter();
//		for(int i=0;i<=sh.getLastRowNum();i++) {
//			Row r=sh.getRow(i);
//			for(int j=0;j<r.getLastCellNum();j++) {
//				Cell c=r.getCell(j);
//				String value=df.formatCellValue(c);
//				System.out.println(value+" ");
//			}
//			System.out.println();
//		}
//		ExcelUtility eUtil=new ExcelUtility();
//		List<String> value=eUtil.getMultipleDataFromExcelFile("Animal", 1, 0);
//		System.out.println(value);
		
		JavaUtility jUtil=new JavaUtility();
		int value=jUtil.generateRandomNumber(1000);
		System.out.println(value);
		
		String dateStamp=jUtil.getCalendarDetails("dd-MM-YYYY");
		System.out.println(dateStamp);
		
		String dateTimeStamp=jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
		System.out.println(dateTimeStamp);
		
	}

}
