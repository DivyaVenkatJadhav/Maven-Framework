package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import Browser.Baseclass2;
import Errors.ScreenShots;
import Excel.ExcelReader;
import pages.Homepages;


import pages.Registration2;


public class LoginTest {

	WebDriver driver;
	
	Baseclass2 Base;
	pages.Loginpage login;
	Homepages Home;
	Registration2 Reg2;
	
 @BeforeClass 
   public void openBrowser() {
	Base= new Baseclass2();
	driver=Base.OpenBrowser();
}
	
 @DataProvider	
	public Object[][]getData() throws IOException{
	   ExcelReader E=new ExcelReader();
	   Object[][] data= E.gettestdata("Sheet2","C:\\Users\\dhira\\eclipse-workspace\\MavenParaBankDataframework\\TestData\\test data.xlsx");
	   		
	
	return data;	
 }	
 @org.testng.annotations.Test(dataProvider="getData")
 public void Loginpage(String Username,String Password,String TCID,String Status) throws IOException {
 
       try{
    login=new pages.Loginpage(driver);	   
	login.setusername(Username);
    login.setpassword(Password);
    login.clickonloginbtn();
    
	if(Status.equalsIgnoreCase("valid")){
	    Home = new Homepages(driver);
	Assert.assertTrue(Home.verifyopenNewAccountoptionIspresent());
	
	Home.ClickOnLogout();
	}
        else {
    	   
       String ActualErrormsg=login.getErrormsg();
       Assert.assertEquals(ActualErrormsg,"An internal error has occurred and has been logged.");
       }
 }  
     catch(Exception e) {
    	  e.printStackTrace();
          ScreenShots s= new ScreenShots();
          s.TakeScreenshots(driver,TCID);
     }
 }

	@AfterClass
	public void closeBrowser() {
		Base.CloseBrowser(driver);
	
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	

