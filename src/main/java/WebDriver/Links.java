package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		
		String expLink="Simu";
		boolean status=false;
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Log in with SSO")).click();
		
		System.out.println(driver.findElement(By.linkText("Log in with SSO")).getText());
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int totalLinks= links.size();
		System.out.println("Total number of links on survey monkey login page:"+totalLinks);
		
		//Print link names
		for (int i = 0; i < totalLinks; i++) {
		    String linkName=links.get(i).getText();
			//System.out.println("Link Name is :"+linkName);
			
			if(!(linkName.isEmpty())) {
				System.out.println("Link Name is:"+linkName);
			}
			/*if (linkName.equalsIgnoreCase(expLink)) {
				//System.out.println("pass-link is available");
				status=true;
				break;
				
			} else {
				//System.out.println("fail-link is missing");
				status=false;*/
				
				/*if (status==true) {
					//System.out.println("pass-link is avaialble");
					
				} else {
					System.out.println("fail-link is missing");*/
					

				}

			}
			
		

	}


