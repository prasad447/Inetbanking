package com.inetbanking.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	//constructor
public LoginPage(WebDriver driver){
		
		  this.driver=driver;
		  
		  PageFactory.initElements(driver, this);
		
		}
//locators
	@FindBy(name="uid") WebElement txt_username;
	
	@FindBy(name="password") WebElement txt_pwd;
	
	@FindBy(name="btnLogin")WebElement button;
	
//actions method
	
  public void setUserName(String user) {
	  
	 txt_username.sendKeys(user);
	  
}
  
public void setPassword(String pwd) {
	
	txt_pwd.sendKeys(pwd);
}

public void	clickLoginButton(){
	
	button.click();
	
	
}
	
}
