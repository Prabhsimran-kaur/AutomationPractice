package WebdriverPractice;
//links start with<a tag name

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingLinksPractice {

	public static void main(String[] args) {
		String expLink="sim";
		boolean status=false;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		//Click on link
		//driver.findElement(By.linkText("Log in with SSO")).click();
		//Capture link name
		System.out.println(driver.findElement(By.linkText("Log in with SSO")).getText());
		//Count number of links
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int totalLinks=links.size();
		System.out.println("Total number of links on survey monkey:"+totalLinks);
		
	    //Print all link names
		for (int i = 0; i <totalLinks ; i++) {
			String linkName=links.get(i).getText();
			 if(!(linkName.isEmpty()))
				 System.out.println("Link Nmae is:"+linkName );
			
			//System.out.println("Link Names  are:"+linkName);
			//Verify if some link is present
			/*if (linkName.equalsIgnoreCase(expLink)) {
				//System.out.println("pass=link available");
				
				status=true;//store value
				break;//to terminate loop
				} else {
				status=false;
				//System.out.println("fail=link missing");*/
     }		
			
		
		/*if (status==true) {
			//System.out.println("pass=link available");
			
		} else {
			System.out.println("fail=link missing");
			
			
			

		}*/
		
		}

}
