package WebdriverPractice;
import java.util.List;

//send keys--. input field
//select tag in dropdown
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		String expMonth="sim";
		boolean status=false;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//1:click on create a account button
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);//wait for 5 seconds
		
		//2:select value from DropDown
		/*driver.findElement(By.id("month")).sendKeys("Mar");
		driver.findElement(By.id("day")).sendKeys("31");
		driver.findElement(By.id("year")).sendKeys("1991");*/
		
		//3:Selecting using Select class
		/*Select select=new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Mar");
		Thread.sleep(1000);
		
		Select select1=new Select(driver.findElement(By.id("day")));
		select1.selectByIndex(8);
		Thread.sleep(1000);
		
		Select select2=new Select(driver.findElement(By.id("year")));
		select2.selectByValue("1991");
		Thread.sleep(1000);*/
		
//3:counting number of values(months) in DropDown==display 13 values
		//List<WebElement>months=select.getOptions();
	//	System.out.println("Total number of values in month drop down is:"+months.size());
		
		//4: Print all values from month DropDown
	/*	for (int i = 0; i < months.size(); i++) {
			String monthValue=months.get(i).getText();//getText gives string value
			System.out.println("Value in Month Drop Down is: " +monthValue);
			if (monthValue.equalsIgnoreCase(expMonth)) {
				
			status=true;
				break;
				
			} else {
				status=false;
				

			}
			
		}
		if (status==true) {
			System.out.println("pass");
			} else {
			System.out.println("fail");

			}*/
		//printing all values of DropDown without select class
	List<WebElement>months=	driver.findElements(By.xpath("//*[@id='month']/option"));
	for (int i = 0; i < months.size(); i++) {
		String monthName=months.get(i).getText();
		System.out.println(monthName);
		
		//selecting may from dropdown
		if (monthName.equals("May")) {
			months.get(i).click();
			break;
			
		}
		
	}
	
		
		
		
		
		
		
		
		

	}

}
