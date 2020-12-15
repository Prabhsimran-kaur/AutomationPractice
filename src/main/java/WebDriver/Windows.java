package WebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		/*Set<String>winIds=driver.getWindowHandles();
		System.out.println("Total number of windows:"+winIds.size());*/
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		String FaceBookTitle =driver.getTitle();
		System.out.println("Facebook Title is:"+FaceBookTitle);
		
		System.out.println("Clicking on Cookies Policy Link");
		Thread.sleep(2000);
		driver.findElement(By.id("cookie-use-link")).click();
		
		Set<String>winIds=driver.getWindowHandles();
		System.out.println("Total number of windows:"+winIds.size());
		System.out.println("Cookies Policy Title is:"+driver.getTitle());
		Iterator<String> itr=winIds.iterator();
		String FacebookWindowId=itr.next();
		String cookiesPolicyWindow=itr.next();
		System.out.println("facebook window id is:"+FacebookWindowId);
		System.out.println("cookies policy is:"+cookiesPolicyWindow);
		driver.switchTo().window(cookiesPolicyWindow);
		
		System.out.println("Cookies policy window i:"+driver.getTitle());
		
		driver.switchTo().window(FacebookWindowId);
		System.out.println("facebook window id :"+driver.getTitle());
		
		
		
		
	}

}
