package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Demo3 {

	@Parameters({"URL"})
	@Test(groups = {"Smoke"})
	public void webloginCar(String urlName) {
		System.out.println("WebLogin Car");
		System.out.println(urlName);
	}
	
	@Test
	public void mobileLoginCar() {
		System.out.println("MobileLogin Car");
	}
	
	}
