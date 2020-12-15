package WebDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DRopDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expMonth ="Oct";
		boolean status =false;
		
		
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("month")).sendKeys("march");
		
		//Select using select class
		
		Select select= new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Mar");
		Thread.sleep(1000);
		
		Select select2= new Select(driver.findElement(By.id("day")));
		select2.selectByIndex(31);
		Thread.sleep(1000);
		
		Select select3= new Select(driver.findElement(By.id("year")));
		select3.selectByValue("1991");
		Thread.sleep(1000);
		
		
	List<WebElement>months=select.getOptions();
	System.out.println("Total number of values in month:"+months.size());
	
	for (int i = 0; i < months.size(); i++)
	{
		String monthValue=months.get(i).getText();
		System.out.println("Value in Drop down is:"+monthValue);
		
		if (monthValue.equalsIgnoreCase(expMonth)) {
			status=true;
			break;
			} else {
		    status= false;
			}}
			
			
		if (status==true) {
			System.out.println("Pass");
			} else {
			System.out.println("fail");
		

		}
		//print all values of dropdown without select class
		
		
		List<WebElement>months2= driver.findElements(By.xpath("//*[@id='month']/option"));
		for (int i = 0; i < months2.size(); i++) {
			String monthName=months2.get(i).getText();
			System.out.println(monthName);
			
			//
			if (monthName.equals("Mar")) {
				months.get(i).click();
				break;
				
			}
			
		}
	
        
       
		
		

		}}
		
	
		
		
		
				
		
		
		
	


