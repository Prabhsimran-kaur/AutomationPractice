package WebDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		
		String FaceBookTitle =driver.getTitle();
		System.out.println("Facebook Title is:"+FaceBookTitle);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		System.out.println("Clicking on Cookies Policy Link");
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email")))).sendKeys("abc");;
		driver.findElement(By.id("email")).sendKeys("test1234");
		
		driver.findElement(By.id("cookie-use-link")).click();
		
		
		
	}

}
