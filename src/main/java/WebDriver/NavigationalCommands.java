package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//opens chrome browser of selenium

		//open google appl
		driver.get("http://www.google.ca");
		
	    driver.get("http://www.amazon.ca");
		driver.navigate().to("http://www.amazon.ca");//overloading method
	
		
		
		
		//Switching back to google app
		driver.navigate().back();
		
		//Switching to amazon
		
		driver.navigate().forward();
		
		//press refresh button
		
		driver.navigate().refresh();
	}

}
