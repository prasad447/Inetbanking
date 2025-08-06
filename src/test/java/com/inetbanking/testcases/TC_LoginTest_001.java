package com.inetbanking.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjectModel.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException {
		
		
		driver.get(BaseUrl);
		
		log.info("url opened");
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(userName);
		log.info("enter username");
		lp.setPassword(passWord);
		log.info("enter password");
		
		
		lp.clickLoginButton();
		
		Thread.sleep(5000);
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
			log.info("login test passed");
		}
		else {
			Assert.assertTrue(false);
			log.info("login test failed");
			
		}
		
		
		
		
		
	}

}
