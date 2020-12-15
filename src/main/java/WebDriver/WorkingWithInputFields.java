package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithInputFields {

	public static void main(String[] args) throws InterruptedException {
     
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.surveymonkey.com/user/sign-in/");
	
	WebElement uId=driver.findElement(By.id("username"));
	
	String val=uId.getAttribute("value");
	System.out.println("Before entering any value:------>"+val.isEmpty());
	
	
	
	//enter value in input field
	driver.findElement(By.id("username")).sendKeys("old value");
	Thread.sleep(2000);
	
	//clear values
	uId.clear();
	Thread.sleep(2000);
	
	
	uId.sendKeys("selenium 1");
	
	//capture the value that is entered in input field
    String usernameVal =uId.getAttribute("value");
    System.out.println("username is entered------------>"+usernameVal);
    System.out.println("IsEmptyValue is:"+usernameVal.isEmpty());
    
    if (usernameVal.isEmpty())
    {
    	System.out.println("value is not entered");
    }
    else
    {
    	System.out.println("value is entered");
    }
    
    //Capture link value
   String LinkValue=driver.findElement(By.linkText("Forgot username or password?")).getText();
   System.out.println("Forgot username or password----------->"+LinkValue);
    
    
	
	
	
	
	

	}

}
