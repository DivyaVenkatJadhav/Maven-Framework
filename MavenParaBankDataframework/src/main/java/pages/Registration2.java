package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration2 {


@FindBy(xpath="//input[@id=\"customer.firstName\"]") private WebElement Fname;
@FindBy(xpath="//input[@id='customer.lastName']") private WebElement LName;
@FindBy(xpath="//input[@id='customer.address.street']") private WebElement Add;
@FindBy(xpath="//input[@id='customer.address.city']") private WebElement City;
@FindBy(xpath="//input[@id='customer.address.state']") private WebElement State;	
@FindBy(xpath="//input[@id='customer.address.zipCode']") private WebElement Zip;
@FindBy(xpath="//input[@id='customer.phoneNumber']") private WebElement Phone;
@FindBy(xpath="//input[@id='customer.ssn']") private WebElement Ssn;
@FindBy(xpath="//input[@id='customer.username']") private WebElement Uname;
@FindBy(xpath="//input[@id='customer.password']") private WebElement Pwd;
@FindBy(xpath="//input[@id='repeatedPassword']") private WebElement Cpwd;
@FindBy(xpath="//input[@value='Register']") private WebElement registerbtn;
@FindBy(xpath="(//p)[3]")private WebElement verifymsg;
	
	//init
	public  Registration2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage

	public void setfname(String FName)
	{
		Fname.sendKeys(FName);
	}
	public void setlname(String Lname)
	{
		LName.sendKeys(Lname);
	}
	public void setadd(String Address)
	{
		Add.sendKeys(Address);
	}
	public void setcity(String city)
	{
		City.sendKeys(city);
	}
	public void setstate(String state)
	{
		State.sendKeys(state);
	}
	public void setzip(String zipcode)
	{
		Zip.sendKeys(zipcode);
	}
	public void setphone(String phoneno)
	{
		Phone.sendKeys(phoneno);
	}
	public void setssn(String ssn)
	{
		Ssn.sendKeys(ssn);
	}
	
	public void setuname(String uname)
	{
		Uname.sendKeys(uname);
	}
	public void setpwd(String pwd)
	{
		Pwd.sendKeys(pwd);
	}
	public void setcpwd(String cpwd)
	{
		Cpwd.sendKeys(cpwd);
	}
	public void ClickonRegisterButton() 
	{
		registerbtn.click();	
	
	}

	

	public String VerifyAccountopened() {
		String res = verifymsg.getText();
		return res;
	}

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

