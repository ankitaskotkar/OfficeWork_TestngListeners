	

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;		
	

@Listeners(ListenerTest.class)	

public class TestCases {				


// Test to pass as to verify listeners .		
@Test		
public void Login()
{		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
    driver.get("http://demo.guru99.com/V4/");					
    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
    driver.findElement(By.name("password")).sendKeys("amUpenu");							
    driver.findElement(By.name("btnLogin")).click();					
}		

// Forcefully failed this test as to verify listener.		
@Test	
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
   Assert.assertTrue(false);			
}	

@Test
public void aSkipTest(){
	String a ="Skip Test";
	if(a.equals("Skip Test")){
		throw new SkipException("Skipping - This is not ready for testing ");
	}else{
		System.out.println("I am in else condition");
	}
	System.out.println("I am out of the if else condition");
}
}