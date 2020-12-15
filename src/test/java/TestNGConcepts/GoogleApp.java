package TestNGConcepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleApp {
	@Test
	@Parameters({"url"})
	public void launchGoogleApplication(String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		//String appTitle=driver.getTitle();
		/*if (appTitle.equalsIgnoreCase("Google")) {
			System.out.println("Pass");
			} 
		else {
			System.out.println("Fail");

		}*/
		
	//AssertJUnit.assertEquals(appTitle, "Google");
	//System.out.println("Statement fails");
		
	//AssertJUnit.assertEquals(appTitle,"Facebook" );//overloading
	//System.out.println("after fail");
	
	
	//driver.quit();
	
      
	}}
