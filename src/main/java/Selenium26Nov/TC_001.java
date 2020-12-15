package Selenium26Nov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		String getText=driver.findElement(By.className("col-md-12")).getText();
		System.out.println(getText);
		
		//driver.findElement(By.linkText("This is a link")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("JavaTpoint");
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("idOfButton")).click();
		driver.findElement(By.id("male")).click();
		driver.findElement(By.cssSelector("input.Automation")).click();
		
		Select dropdown= new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Database Testing");
		Thread.sleep(2000);
		driver.findElement(By.linkText("This is a link")).click();
		
	driver.quit();
		
		
	}

}
