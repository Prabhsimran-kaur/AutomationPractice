 package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropetiesConcept {
	WebDriver driver;
	@Test
	public void login() throws IOException {
		Properties prop=new Properties();
		try {
	FileInputStream fis= new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\SeleniumConcepts\\config.properties");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch(IOException e) {
			e.printStackTrace();
		}
		//FileInputStream fis= new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\SeleniumConcepts\\config.properties");
		//prop.load(fis);
		
		
		
		
		String retUsername= prop.getProperty("username");
		String retPassword=prop.getProperty("password");
		String retBrowserName=prop.getProperty("browsertype");
		String retUrl=prop.getProperty("url");
		System.out.println(retUsername+"-----"+retPassword+"------"+retBrowserName+"------"+retUrl);
		
		if (retBrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			
		} else if (retBrowserName.equalsIgnoreCase("ie")){
			WebDriverManager.iedriver().setup();
			 driver= new InternetExplorerDriver ();
			
		}else {
			WebDriverManager.firefoxdriver().setup();
			 driver= new FirefoxDriver();
		

	}
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		driver.findElement(By.id("username")).sendKeys("selenium1");
		driver.findElement(By.id("password")).sendKeys("selenium1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
