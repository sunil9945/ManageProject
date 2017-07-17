package Com.Flo.Data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readpropertiesfile {

	Properties properties;
	String Username, Password;

	public void loadData() throws IOException {

		properties = new Properties();
		File f = new File(System.getProperty("user.dir") + "\\src\\main\\java\\Com\\Properties\\File.properties");
		FileReader fileobj = new FileReader(f);
		properties.load(fileobj);

	}

	public String getobject(String Data) throws IOException {
		loadData();
		String data = properties.getProperty(Data);
		return data;
	}
	
	public String getusername(String Username) throws IOException{
		loadData();
		Username = properties.getProperty(Username);
		return Username;		
	}
	
	public String getpassword(String password) throws IOException{
		loadData();
		Password = properties.getProperty(password);
		return Password;		
	}
}
