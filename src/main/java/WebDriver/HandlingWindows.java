package WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(" https://the-internet.herokuapp.com/");
		System.out.println("Title is"+driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //a[contains(text(),'Multiple Windows')]")).click();
		System.out.println(driver.getTitle());
		System.out.println("before switching");
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		System.out.println(driver.getTitle());
		Set<String>winIds=driver.getWindowHandles();
		System.out.println("Total number of windows opened"+winIds.size());
		
		
		Iterator<String>itr=winIds.iterator();
		String parentId=itr.next();
		System.out.println(parentId);
		
		String childId=itr.next();
		System.out.println(childId);
		driver.switchTo().window(childId);
		System.out.println("Child id is:"+childId);
		String childTitle=driver.getTitle();
		System.out.println("childTile is:"+childTitle);
		System.out.println("After switch to child");
		
		driver.switchTo().window(parentId);
		System.out.println("Switching back to parent:"+driver.getTitle());
		
	
		
		
		//System.out.println("before Switching");
		//System.out.println(driver.getTitle());
		
		
		/*driver.findElement(By.xpath(" //a[contains(text(),'Multiple Windows')]")).click();
		
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>itr=ids.iterator();
		String parentId=itr.next();
		String childId=itr.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		System.out.println("after switching");*/
		
	}

}
