package configreadexample;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readdatefromfile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./configfile/configfile.date.properties");
		
		Properties pro = new Properties();
		
		pro.load(fis);
		
		System.out.println(pro.getProperty("appURL"));
		System.out.println(pro.getProperty("userName"));
		System.out.println(pro.getProperty("password"));
		System.out.println(pro.getProperty("exuecuteonbrowser"));
		
		
	}

}
