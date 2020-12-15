package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;import org.testng.annotations.BeforeMethod;import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgCode {
	public WebDriver driver;
	//1
		@BeforeTest
		public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		}
		
		//2
		@BeforeMethod
		public void HomePage() {
		String expectedTitle= "Welcome: Mercury Tours";
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		}
		//3
		@Test(priority=1)
		public void register() {
			driver.findElement(By.linkText("REGISTER")).click();
			String expectedTitle="Register: Mercury Tours";
			String actualTitle=driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			
			
			
			}
		@Test(priority=2)
		public void support() {
            driver.findElement(By.linkText("SUPPORT")).click() ;
            String expectedTitle= "Under Construction: Mercury Tours";
          String  actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
		}
		//4
		@AfterMethod
	      public void goBackToHomepage ( ) {
	            driver.findElement(By.linkText("Home")).click() ;
	      }

        @AfterTest
      public void terminatePage() {
       driver.quit();
               } 

			
			
			
	
			
		
	
		
		
	

}
