package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SurveyLogin {
@Test
	public void Login() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.surveymonkey.com/user/sign-in/");
	String actTest=driver.findElement(By.xpath("//label[contains(text(),'Enter your username')]")).getText();
	AssertJUnit.assertEquals(actTest, "Enter your username" ,"'Enter your username',text is not matching");
	//AssertJUnit.assertEquals(actTest,"Enter your username","text is matching");
	
	/*if (actTest.equalsIgnoreCase("Enter your username")) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
		}*/
	
	

	/*driver.findElement(By.id("username")).sendKeys("seleniumtraining1");
	driver.findElement(By.id("password")).sendKeys("selenium1234");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String dashboardText=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/ol[1]/li[1]/a[1]")).getText();
	AssertJUnit.assertEquals(dashboardText,"Dashboard","Dashboard text is not matching");
	/*if (dashboardText.equalsIgnoreCase("Dashboard")) {
		System.out.println("Pass");
	} else {
		System.out.println("Fail");
	}*/
	
}
}

	
	
	
	
	
	
	
	
	
    
	
	


