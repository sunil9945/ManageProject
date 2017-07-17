package Com.Flo.Data;

import java.io.IOException;

public class PropDatareadmethods extends Readpropertiesfile {

	public String readbrowser() throws IOException {
		String browser = getobject("Browser");
		return browser;
	}

	public String readURL() throws IOException {
		String URL = getobject("URL");
		return URL;
	}

	public String readusername(String Username) throws IOException {
		String Read_username = getusername(Username);
		return Read_username;
	}

	public String readpassword(String password) throws IOException {
		String Read_password = getusername(password);
		return Read_password;
	}
}
