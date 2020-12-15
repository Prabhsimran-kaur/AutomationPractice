package WebdriverPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//Set<String>winIds=driver.getWindowHandles();
		//System.out.println("Total number of windows opened"+winIds.size());
		
		
		String faceBookTitle=driver.getTitle();
		System.out.println("faceBookTitle is:"+faceBookTitle);
		//click on Account button
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		
		Thread.sleep(20000);
		
		
		
		
	driver.findElement(By.id("cookie-use-link")).click();
	System.out.println("click on cookies policy");
	
	Set<String>winIds=driver.getWindowHandles();
	System.out.println("Total number of windows opened"+winIds.size());
	
	
	Iterator<String>itr=winIds.iterator();
	String facebookWindowId=itr.next();
	System.out.println(facebookWindowId);
	
	String cookiesPolicyWindow=itr.next();
	System.out.println(cookiesPolicyWindow);
	
	driver.switchTo().window(cookiesPolicyWindow);
	
	System.out.println("Cookies Policy title is:"+driver.getTitle());
		
		
		

	}

}
