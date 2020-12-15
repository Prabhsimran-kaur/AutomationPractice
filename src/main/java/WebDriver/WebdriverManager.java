package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();\
		//WebDriverManager.iedriver().setup();
		//WebDriver driver= new InternetExplorerDriver();
		//WebDriver driver= new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();	
        WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.ca");
		//System.out.println(driver.getTitle());

	}

}
