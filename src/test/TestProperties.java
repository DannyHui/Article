package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inputStream =  TestProperties.class.getClassLoader().getResourceAsStream("jdbc.properties");
		Properties p = new Properties();
		try {
		    p.load(inputStream);
		    System.out.println(p.getProperty("db.username"));
		    System.out.println(p.getProperty("db.password"));
		    System.out.println(p.getProperty("db.dataBaseName"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

}
