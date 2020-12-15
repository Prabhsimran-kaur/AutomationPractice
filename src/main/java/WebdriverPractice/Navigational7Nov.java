package WebdriverPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational7Nov {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		//system property for chrome driver
		WebDriver driver= new ChromeDriver();
		//initiate a chrome driver class
		driver.manage().window().maximize();
		//Opening Application
		driver.get("https://www.google.ca/");
		//Capture Google Title
		System.out.println(driver.getTitle());
		//Open facebook
		driver.get("http://www.facebook.com");
		//Go back to google app
		driver.navigate().back();
		//Come back to facebook
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		//Refresh current application
		driver.navigate().refresh();
		
		

	}

}
