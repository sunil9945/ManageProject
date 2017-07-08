package Com.Flo.Data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readpropertiesfile {

	Properties properties;

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
}
