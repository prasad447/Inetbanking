package com.inetbanking.testcases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	
	     public WebDriver driver;
		  public  Logger log;
	     
	     public String BaseUrl="https://demo.guru99.com/V1/index.php";
	     public String userName="mngr630233";
	     public String passWord="tEbadEh";
	     
@BeforeClass
	
	public void setUp() {
		
		System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		log=Logger.getLogger("baseclass.class");
		PropertyConfigurator.configure("log4j.properties");
		
		
		
		
		
	}
	
	
	
	
	
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
}
