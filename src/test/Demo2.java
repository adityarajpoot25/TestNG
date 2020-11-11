package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 {

	
	@Test(groups = {"Smoke"},dataProvider="getData")
	public void method3(String userName, String password) {
		System.out.println("Bye");
		System.out.println(userName);
		System.out.println(password);
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("PreCondition");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data =new Object[3][2];
		data[0][0]="firstUsername";
		data[0][1]="firstPassword";
		
		data[1][0]="secondUsername";
		data[1][1]="secondPassword";
		
		data[2][0]="thirdUsername";
		data[2][1]="thirdPassword";
		
		return data;
	}
	
	
}
