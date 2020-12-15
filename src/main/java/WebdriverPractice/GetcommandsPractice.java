package WebdriverPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcommandsPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		//system property for chrome driver
		WebDriver driver= new ChromeDriver();
		//initiate a chrome driver class
		driver.manage().window().maximize();
		
		driver.get("https://www.google.ca/");
		
		String appTitle= driver.getTitle();
		System.out.println("Title of app:"+appTitle);
		
		int titleLength=driver.getTitle().length();
		System.out.println("length of tilte is:"+titleLength);
		
		if(appTitle.equalsIgnoreCase("google")) {
			System.out.println("google app is opened");
		}else {
			System.out.println("other app is opened");
		}
		
		String pageSource= driver.getPageSource();
		int pagesourceLength=driver.getPageSource().length();
		System.out.println("length of pagesource:"+pagesourceLength);
		
		String appUrl= driver.getCurrentUrl();
		System.out.println("url of app is:"+appUrl);
		
		/*if(appUrl.contains("google")) {
			System.out.println("url is correct");
			
		}else {
			System.out.println("url si wrong");
		}*/
		
		String updatedText=appUrl.substring(12,18);
		System.out.println("updatedtext");
		
		
		if(updatedText.equals("google")){
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			}
		
				
		driver.close();
	}
}