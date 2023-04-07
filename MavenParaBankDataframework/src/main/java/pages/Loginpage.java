package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.PropertyFileReader;

public class Loginpage {
@FindBy(xpath="//input[@name='username']") private WebElement uname;
@FindBy(xpath="//input[@name='password']") private WebElement pwd;
@FindBy(xpath="//input[@value='Log In']") private WebElement Loginbtn;
@FindBy(xpath="//a[text()='Forgot login info?']") private WebElement forgotpassword;
@FindBy(xpath="//a[text()='Register']") private WebElement registerbtn;
@FindBy(xpath="//p[text()='An internal error has occurred and has been logged.']") private WebElement Errormsg;

 public Loginpage(WebDriver driver)
{
  PageFactory.initElements(driver,this);
  
}
   PropertyFileReader p = new PropertyFileReader();
  public void clickonregisterbtn() {
    registerbtn.click();
}
	
    public void setusername(String username) {
   uname.sendKeys(username);
}
    public void setpassword(String password) {
   pwd.sendKeys(password);
}
    public void clickonloginbtn() {
   Loginbtn.click();
}
 // public String AccountsOverview() {
// String lo=registerbtn.getText();
	//return lo;
  //}	

  public String getErrormsg() {
		 String actual=Errormsg.getText();
			return actual;
		  }	
  public void setusername() {
	   uname.sendKeys(p.getUserName());
	}
  public void setpassword() {
	   pwd.sendKeys(p.getPassword());
	}
}
	 
	
	
	
	
	
	
	
		
	
 
 






























