package WebdriverPractice;
//getText:fet test works for runtime value
//getAttribute

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputFieldsPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		
		WebElement uId=driver.findElement(By.id("username"));
		
		//1:entering value in input field
		String val=uId.getAttribute("value");
		
		System.out.println("Before entering any value:"+val.isEmpty());
		uId.sendKeys("old value");
		Thread.sleep(2000);
		//2:clear value that is in input field
		uId.clear();
		Thread.sleep(2000);
		
		uId.sendKeys("seleniumtraining1");
		
		//3 Capture value that is entered in input field
		String usernameVal=uId.getAttribute("value");
		System.out.println("Username entered is---:"+usernameVal);
		System.out.println("Is Empty value is:"+usernameVal.isEmpty());
		
		if (usernameVal.isEmpty()) {
			System.out.println("Value is not entered");
			
		} else {
			System.out.println("value is entered");

		}
		//String linkValue=driver.findElement(By.linkText("Forgot username or password?")).getText();
		//System.out.println("forgot username and password is:-->"+linkValue);
		
		
		
		
		
		
		
		

	}

}
