package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	
	public String getKeyAndValuePair(String Key) throws Throwable
	{
		FileInputStream loginDetails = new FileInputStream("./src/test/resources/LoginFile.properties");
		
		Properties pro = new Properties();
		
		pro.load(loginDetails);
		
		String Value =pro.getProperty(Key);
		return Value;
	}
	

}
