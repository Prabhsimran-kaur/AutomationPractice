package WebdriverPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithAlertsPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
	Alert alert=driver.switchTo().alert();
	String alertText=alert.getText();
	System.out.println("Text Captured from Alert: "+alertText);
	
	Thread.sleep(5000);
	alert.sendKeys("123");
	
	
	//Clicking on OK Button
	//alert.accept();//click on OK button
	alert.dismiss();
	
	
	}

}
