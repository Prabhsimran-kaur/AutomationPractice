package Selenium26Nov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_002Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		String innerText=driver.findElement(By.xpath("//table/tbody/tr/td[2]"
				+"/table/tbody/tr[4]/td"
				+"/table/tbody/tr/td[2]"
				+"/table/tbody/tr[2]/td[1]"
				+"/table[2]/tbody/tr[3]/td[2]/font")).getText();
		
		System.out.println(innerText);
	}

}
