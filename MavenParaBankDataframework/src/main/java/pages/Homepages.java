package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepages {
	// declaration
@FindBy(xpath="//a[text()='Open New Account']") private WebElement opennewaccount;
@FindBy(xpath="//a[text()='Accounts Overview']") private WebElement accounttooverview;
@FindBy(xpath="//a[text()='Transfer Founts']") private WebElement transferfounds;
@FindBy(xpath="//a[text()='Bill Pay']") private WebElement billpay;
@FindBy(xpath="//a[text()='Find Transactions']") private WebElement findtransactions;
@FindBy(xpath="//a[text()='Update Contat Info']") private WebElement updatecontactinfo;
@FindBy(xpath="//a[text()='Request Loan']") private WebElement requestloan;
@FindBy(xpath="//a[text()='Log Out']") private WebElement logout;

  public Homepages(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  public void ClickOnLogout()
  {
	  logout.click();
  }
    public void ClickOnOpenAccount() {
      opennewaccount.click();
    }

  public boolean verifyopenNewAccountoptionIspresent() {

  boolean result=opennewaccount.isDisplayed();
  return result;

}
   
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
