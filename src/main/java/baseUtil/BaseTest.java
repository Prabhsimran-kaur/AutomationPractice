package baseUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
     Webdriver driver;
	
	public  WebDriver launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			
		} else if (browserName.equalsIgnoreCase("IE")){
		WebDriverManager.iedriver().setup();
		WebDriver driver=new InternetExplorerDriver();   

		}else {
			System.out.println("no matching browser");
		}
		//return driver object
	//return driver;
		 
	}

}
