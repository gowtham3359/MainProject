package seleniumsection3;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		
	//	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData\\TestData.properties");
	//	Properties prop=new Properties();
	//	prop.load(fis);
	//	String value=prop.getProperty("url");
	//	String un=prop.getProperty("username");
	//	String pwd=prop.getProperty("password");
		PropertiesUtility pUtil=new PropertiesUtility();
		String value=pUtil.getDataFromPropertiesFile("url");
		driver.get(value);
		String un=pUtil.getDataFromPropertiesFile("username");
		String pwd=pUtil.getDataFromPropertiesFile("password");
	//	driver.findElement(By.xpath(""));
		
	}

}


