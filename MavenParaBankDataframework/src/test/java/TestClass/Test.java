package TestClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.Assert;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.DataProvider;

import Browser.Baseclass2;
import Errors.ScreenShots;
import Excel.ExcelReader;
import pages.Homepages;
import pages.Loginpage;
import pages.Registration2;

public class Test {

	WebDriver driver;
	Baseclass2 Base;
	Loginpage login;
	Homepages Home;
	Registration2 Reg2;
	
 @BeforeClass 
   public void openBrowser() {
	Base= new Baseclass2();
	driver=Base.OpenBrowser();
}
	@DataProvider
	public Object[][] getData() throws IOException
	{
		ExcelReader e=new ExcelReader();
		Object[][] data=e.gettestdata("Registration", "C:\\Users\\dhira\\eclipse-workspace\\MavenParaBankDataframework\\TestData\\test data.xlsx");
		
		return data;
	}
 
	
  @org.testng.annotations.Test(dataProvider="getData")
     public void Registration(String FName,String Lname,String Address,String city,String state, String zipcode,String phoneno,String ssn,String uname,String pwd,String cpwd) throws IOException{ 	
	  try {
	       login = new Loginpage(driver);
	       login.clickonregisterbtn();
	
	Reg2 = new Registration2(driver);
	Reg2.setfname(FName);
	Reg2.setlname(Lname);
	Reg2.setadd(Address);
	Reg2.setcity(city);
	Reg2.setstate(state);
	Reg2.setzip(zipcode);
	Reg2.setphone(phoneno);
	Reg2.setssn(ssn);
	Reg2.setuname(uname);
	Reg2.setpwd(pwd);
	Reg2.setcpwd(cpwd);
	Reg2.ClickonRegisterButton();
			
	Assert.assertEquals(Reg2.VerifyAccountopened(), "Your account was created successfully. You are now logged in.");
	Home=new Homepages(driver);
	Home.ClickOnLogout();
	
  }	catch(Exception E) {
	  E.printStackTrace();
	  ScreenShots s=new ScreenShots();
	  s.TakeScreenshots(driver,"1001");
  }
	catch(AssertionError a) {
	  a.printStackTrace();
	  ScreenShots s= new ScreenShots();
	  s.TakeScreenshots(driver,"2020");
	}
  }	  
	@AfterClass
	public void closeBrowser() {
		Base.CloseBrowser(driver);
	
	
  }	
}
