package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		
		//Thread.sleep(1000);
		
	driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).click();
	Thread.sleep(5000);
	
		driver.findElement(By.xpath("//label[contains(text(),'Multicity')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("MultiCityModelAlert")).click();
		
		Thread.sleep(1000);
		
		//check box
		
		driver.findElement(By.xpath("//label[contains(text(),'Senior Citizen')]")).click();
	}

}
