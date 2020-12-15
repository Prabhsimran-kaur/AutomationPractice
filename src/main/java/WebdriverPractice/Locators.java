package WebdriverPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//opens chrome browser of selenium
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("username")).sendKeys("selenium");
		driver.findElement(By.id("password")).sendKeys("selenium1234");
		
		driver.findElement(By.xpath("//*[@id='sign_in_form']/fieldset/div/div[5]/button"));*/
		
		
		driver.findElement(By.id("username")).sendKeys("seleniumtraining1");
		driver.findElement(By.name("password")).sendKeys("selenium1234");
		//driver.findElement(By.cssSelector("#sign_in_form > fieldset > div > div:nth-child(5) > button")).click();
		
		//driver.findElement(By.className("wds-button--icon-right")).click();
		driver.findElement(By.linkText("Log in with SSO")).click();
		
		driver.close();
	}
}




