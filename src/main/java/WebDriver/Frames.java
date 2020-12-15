package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//SWitching inside farme
		driver.switchTo().frame(0);
		
		//Capture draggable text
		
	String dragText	=driver.findElement(By.id("draggable")).getText();
	System.out.println(dragText);
	
	String dropText=driver.findElement(By.id("droppable")).getText();
	System.out.println(dropText);
	
	WebElement a=driver.findElement(By.id("draggable"));
	
	WebElement b=driver.findElement(By.id("droppable"));
	
	Thread.sleep(200);
	
	Actions actions= new Actions(driver);
	actions.dragAndDrop(a,b).build().perform();
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[contains(text(),'Selectable')]")).click();
	

	}

}
