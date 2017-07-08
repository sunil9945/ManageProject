package Com.Flo.Data;

import java.io.IOException;

public class PropDatareadmethods extends Readpropertiesfile {
	
	public String readbrowser() throws IOException{
		String browser = getobject("Browser");
		return browser;
	}
	
	public String readURL() throws IOException {
	String URL = getobject("URL");
	return URL;
	}
		
}
