package WebdriverPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.ca/");//http is mandatory
		//count number of images on page
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("total number of images"+images.size());
		
		//2:Capture src url
		for (int i = 0; i < images.size(); i++) {
			String imgSrcVal=images.get(i).getAttribute("src");
			System.out.println(imgSrcVal);
			
		}
		
		
	}
	}


