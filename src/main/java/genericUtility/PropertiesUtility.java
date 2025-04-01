package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This is an utility class which deals with Properties file
 * @author Arun
 * @version 25.02.28
 */

public class PropertiesUtility {
	/**
	 * This is a generic method to fetch a data from Properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */

	public String getDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(IPathUtility.propertiesPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
		
	}
	
}
