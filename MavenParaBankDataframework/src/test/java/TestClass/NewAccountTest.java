package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.Baseclass2;
import Errors.ScreenShots;
import pages.Homepages;
import pages.Loginpage;

public class NewAccountTest {


	WebDriver driver;
	Baseclass2 Base;
	pages.Loginpage login;
	Homepages Home;	
	
  @BeforeClass
   public void openBrowser() {
	   Base= new Baseclass2();
	   driver=Base.OpenBrowser();
	   
  }
	
  @BeforeMethod
    public void LoginUser() {
	  login= new Loginpage(driver);
	  login.setusername();
	  login.setpassword();
	  login.clickonloginbtn();
  }  
	  
  @Test
   public void CreateNewSubAccount() throws IOException {
	  try 
	  {
	  Home=new Homepages(driver);
	  Home.ClickOnOpenAccount();
  }
	  catch(Exception e) 
	  {
	  e.printStackTrace();
	  ScreenShots s= new ScreenShots();
	  s.TakeScreenshots(driver,"TCID");
  }
  }
 @AfterMethod
    public void Logout() {
	 Home.ClickOnLogout();
	 
 }
	
 @AfterClass
  public void closeBrowser() {
	Base.CloseBrowser(driver);
	
 }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

