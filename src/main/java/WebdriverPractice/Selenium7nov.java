package WebdriverPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium7nov {
    //1:Open any browser
	//2:Navigate to "https://www.google.ca/"
	//3:Expected Result:Google application is opened
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		//system property for chrome driver
		WebDriver driver= new ChromeDriver();
		//initiate a chrome driver class
		driver.manage().window().maximize();
		//Opening Application
		driver.get("https://www.google.ca/");
		//capture application url
		
		System.out.println("Application Url is:"+driver.getCurrentUrl());
		//Capturing Application Title
		String appTitle= driver.getTitle();
		System.out.println("Opened application Title is :"+appTitle);
		if (appTitle.equalsIgnoreCase("Gooogle")) {
			System.out.println("Pass");
			
		} else {
			System.out.println("fail");

		}
			
		}
		
		

	}


