package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {




@FindBy(xpath="//input[@id='customer.firstName']") private WebElement Fname;
@FindBy(xpath="//input[@id='customer.lastName']") private WebElement Lname;
@FindBy(xpath="//input[@id='customer.address.street']") private WebElement Add;
@FindBy(xpath="//input[@id='customer.address.city']") private WebElement city;
@FindBy(xpath="//input[@id='customer.address.state']") private WebElement State;
@FindBy(xpath="//input[@id='customer.address.zipCode']") private WebElement zip;
@FindBy(xpath="//input[@id='customer.phoneNumber']") private WebElement phone;
@FindBy(xpath="//input[@id='customer.ssn']") private WebElement ssn;
@FindBy(xpath="//input[@id='customer.username']") private WebElement uname;
@FindBy(xpath="//input[@id='customer.password']") private WebElement pwd;
@FindBy(xpath="//input[@id='repeatedPassword']") private WebElement cpwd;
@FindBy(xpath="//input[@value='Register']") private WebElement registerbtn;
@FindBy(xpath="(//p)[3]")private WebElement verifymsg;
	
	//init
	public  Registration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage

	public void setfname()
	{
		Fname.sendKeys("Divya");
	}
	public void setLname()
	{
		Lname.sendKeys("Jadhav");
	}
	public void setAdd()
	{
		Add.sendKeys("pune");
	}
	public void setcity()
	{
		city.sendKeys("pune");
	}
	public void setstate()
	{
		State.sendKeys("maharashtra");
	}
	public void setzip()
	{
		zip.sendKeys("413605");
	}
	public void setphone()
	{
		phone.sendKeys("94566252556");
	}
	public void setssn()
	{
		ssn.sendKeys("19082001");
	}
	
	public void setuname()
	{
		uname.sendKeys("Divya123@gmail.com");
	}
	public void setpwd()
	{
		pwd.sendKeys("abcd1234");
	}
	public void setcpwd()
	{
		cpwd.sendKeys("abcd1234");
	}
	public void ClickonRegisterButton() throws InterruptedException 
	{
		registerbtn.click();
		Thread.sleep(3000);
	}

	public String VerifyAccountopened() 
	{
		String actual=verifymsg.getText();
		return actual;
	}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

































