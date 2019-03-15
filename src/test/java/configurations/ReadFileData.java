package configurations;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadFileData {
	static String value;
	static String pfile= "C:/Workspace/src/test/java/testdata/datafile.properties";
	public static String readdata(String key) throws Exception{
		FileInputStream file = new FileInputStream(pfile);
		Properties prop = new Properties();
		prop.load(file);
		value = prop.getProperty(key);
		return value;
		
		
		
	}
	
	
	
}
