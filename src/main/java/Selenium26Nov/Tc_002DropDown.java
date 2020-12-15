package Selenium26Nov;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_002DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expMonth ="Oct";
		boolean status =false;
		//Step1
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		
		//Step2
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
				
				//Step3:count number of values in dropdown BY using select
			/*	List<WebElement>months=select.getOptions();
			System.out.println("Total number of values in month:"+months.size());*/
				
				
	//Step4: It gives values in dropdown
				/*for (int i = 0; i < months.size(); i++)
				{
					String monthValue=months.get(i).getText();
					System.out.println("Value in Drop down is:"+monthValue);*/
					/*if (monthValue.equalsIgnoreCase(expMonth)) {
						status=true;
						break;
						} else {
					    status= false;
						}}
						
						
					if (status==true) {
						System.out.println("Pass");
						} else {
						System.out.println("fail");
				
				}}}
				//without using select
/*	List<WebElement>months=	driver.findElements(By.xpath("//*[@id='month']/option"));
	for (int i = 0; i < months.size(); i++) {
		String monthName=months.get(i).getText();
		System.out.println(monthName);*/
	
					/*if (monthValue.equalsIgnoreCase(expMonth)) {
						status=true;
						break;
						} else {
					    status= false;
						}}
						
						
					if (status==true) {
						System.out.println("Pass");
						} else {
						System.out.println("fail");*/}}
					


	

	
