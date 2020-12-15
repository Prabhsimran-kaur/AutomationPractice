package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.iedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		
        //WebDriver driver = new ChromeDriver();//opens chrome browser of selenium
        //WebDriver driver = new InternetExplorerDriver();
          WebDriver driver = new FirefoxDriver();
        
        
		
		driver.get("http://www.google.ca/");
        System.out.println(driver.getTitle());

	}

}
