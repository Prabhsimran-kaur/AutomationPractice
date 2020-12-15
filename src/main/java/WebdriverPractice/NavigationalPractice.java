package WebdriverPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	driver.get("https://www.google.ca/");
	driver.get("http://www.amazon.ca/");
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();

	}

}
