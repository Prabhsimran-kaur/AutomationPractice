package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderConcept {
	@Test(dataProvider="getData")
	public void login(String username,String password) {
		SoftAssert sa =new SoftAssert();
		
		//System.out.println(username+"--------------"+password);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		driver.findElement(By.id("useranme")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String loggedInUser=(driver.findElement(By.id("id=\"userAcctTab_MainMenu\"")).getText());
         String loggedInUser1=	loggedInUser.trim();

		sa.assertEquals(loggedInUser,username,"username is not matching");
		sa.assertAll();
		//System.out.println(getText);
		driver.quit();
	
	}
@DataProvider
	public Object[][] getData() {
		Object userDetails[][]=new Object[2][2];
		userDetails[0][0]="seleniumtraining1";
		userDetails[0][1]="selenium1234";
		
		
		userDetails[1][0]="seleniumtraining2";
		
		userDetails[1][1]="selenium1234";
		return userDetails;
		
		
		
		
		
	/*userDetails[0][0]="seleniumtarining1";
		userDetails[0][1]="selenium123";
		
		userDetails[1][0]="seleniumtarining2";
		userDetails[1][1]="selenium12334";
		
		return userDetails;*/
	}
		
		
	}


