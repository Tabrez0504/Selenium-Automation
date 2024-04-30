package LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WorkingWithPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fls = new FileInputStream("./Testdata/demoweb.properties");
		
		Properties pobj = new Properties();
		//to load all the data
		pobj.load(fls);
		
		//to get key value
		String value1=pobj.getProperty("url");
		System.out.println(value1);
		
		String value2=pobj.getProperty("email");
		System.out.println(value2);
		
		String value3=pobj.getProperty("pwd");
		System.out.println(value3);
		

	}

}
