package configreadexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfigDemo {

	Properties pro;

	public ReadConfigDemo() throws Exception {

		FileInputStream fis = new FileInputStream("./configfile/configfile.date.properties");

		pro = new Properties();

		pro.load(fis);

	}

	public String getAppURL() {
		return pro.getProperty("appURL");

	}
	
	public String getAdminUser() {
		return pro.getProperty("appURL");

	}

	public String getAdminPassword() {
		return pro.getProperty("password");

	}
}
