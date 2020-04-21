import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


import org.testng.Assert;

public class NewTest3 {
  @Test
  public void f1() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  try {
	  System.out.println("This method to test fail");					
	   Assert.assertTrue(false);
	  }catch(Exception e) {
		  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
	  }
  }
}
