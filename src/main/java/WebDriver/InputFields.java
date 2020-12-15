package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputFields {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		driver.manage().window().maximize();
		WebElement uId=driver.findElement(By.id("username"));
		
		
	
		String val=uId.getAttribute("value");
		System.out.println("before entering any value:"+val.isEmpty());
		driver.findElement(By.id("username")).sendKeys("old value");
		Thread.sleep(2000);
		
		uId.clear();
        Thread.sleep(2000);
		
		uId.sendKeys("selenium tarining 1");
		Thread.sleep(20000);
		
		
		String usernameVal=uId.getAttribute("value");
		System.out.println("User Name value entered is--------->:"+usernameVal);
		System.out.println("Is Empty Value is:"+usernameVal.isEmpty());
		if(usernameVal.isEmpty()) {
			System.out.println("value is not entered");
			
		}else {
			System.out.println("value is enteted");
		}
		
		
		String LinkValue=driver.findElement(By.linkText("Forgot username or password?")).getText();
		System.out.println("Forgot username or password --->:"+LinkValue);
		
		//String LinkValue=driver.findElement(By.linkText("Forgot username or password?")).getText();
		//System.out.println("Forgot username or password----------->"+LinkValue);
		
		
		
		
		
		
		

	}

}
