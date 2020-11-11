package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {

	@Parameters({"URL"})
	@Test(groups = {"Smoke"})
	public void method1(String urlName) {
		System.out.println("Welcome Adi");
		System.out.println(urlName);
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("First Step");
	}
	
	@Test
	public void method2() {
		System.out.println("method2");
		
	}
	
	@Test
	public void method4() throws IOException {
		Properties prop= new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\adirajpo\\eclipse-workspace\\TestNG\\src\\datasheet.properties");
		prop.load(fis);
		System.out.println("method2");
		System.out.println(prop.getProperty("userName"));
		
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Last Step");
	}
	
	@AfterTest
	public void postCondition() {
		System.out.println("Post Condition");
	}
}
