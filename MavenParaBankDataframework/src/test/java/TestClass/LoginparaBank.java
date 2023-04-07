package TestClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import Browser.Baseclass2;
import pages.Loginpage;


  public class LoginparaBank {
	
	WebDriver driver;
	Baseclass2 Base;
	Loginpage login;

	
	@BeforeClass 
	  public void openBrowser() {
	Base= new Baseclass2();
		driver=Base.OpenBrowser();
	}
	
  @Test	
 public  void Loginpage() {
	Loginpage login=new Loginpage(driver);
  //  login.setusername();
  //  login.setpassword();
  //  login.setLoginbtn();
   
 }
	
  @AfterClass
  public void closebrowser() {
   Base.CloseBrowser(driver);
  }
  
    

}
















