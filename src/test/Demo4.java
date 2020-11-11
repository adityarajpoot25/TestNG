package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo4 {

	@Test(groups = {"Smoke"})
	public void webloginHome() {
		System.out.println("WebLogin Home");
//		Assert.assertTrue(false);
	}
	
	@Test
	public void mobileLoginHome() {
		System.out.println("MobileLogin Home");
	}
}
