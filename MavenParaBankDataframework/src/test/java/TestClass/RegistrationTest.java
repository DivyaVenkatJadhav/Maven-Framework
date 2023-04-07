package TestClass;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


import Browser.Baseclass2;
import pages.Homepages;
import pages.Loginpage;
import pages.Registration;

public class RegistrationTest {
	WebDriver driver;
	Baseclass2 Base;
	Loginpage login;
	Homepages Home;
	Registration Reg;
	
 @BeforeClass 
   public void openBrowser() {
	Base= new Baseclass2();
	driver=Base.OpenBrowser();
}
 

 
 @Test

  public void Registration() throws InterruptedException {
	login=new Loginpage(driver);
	login.clickonloginbtn();
	Thread.sleep(3000);
	Reg=new Registration(driver);
	Reg.setfname();
	Reg.setLname();
	Reg.setAdd();
	Reg.setcity();
	Reg.setstate();
	Reg.setzip();
	Reg.setphone();
	Reg.setssn();
	Reg.setuname();
	Reg.setpwd();
	Reg.setcpwd();
	Reg.ClickonRegisterButton();
	
	Assert.assertEquals(Reg.VerifyAccountopened(),"Your account was created successfully. You are now logged in.");
	Home=new Homepages(driver);
	Home.ClickOnLogout();
 }
	
 @AfterClass
  public void closebrowser() {
	Base.CloseBrowser(driver);
	
	
}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	











