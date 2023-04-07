package Errors;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {

 public void TakeScreenshots(WebDriver driver,String TCID) throws IOException {
	
 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
File Desc =new File("C:\\Users\\dhira\\eclipse-workspace\\MavenParaBankDataframework\\Screenshot");
	
	FileHandler.copy(src, Desc);
	
	
	
	
	
}
}



