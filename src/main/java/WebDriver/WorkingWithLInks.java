package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithLInks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		
		//click on link
		//driver.findElement(By.linkText("Log in with SSO")).click();
		//capture link name
		System.out.println(driver.findElement(By.linkText("Log in with SSO")).getText());
		//Count number of links
	     /*List<WebElement> links =driver.findElements(By.tagName("a"));
         int totalLinks= links.size();
         System.out.println("Total number of links on survey monkey page:"+totalLinks);
         */
         //Print all links names
         //Verify if some link is present

	}

}
