package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommnads {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//opens chrome browser of selenium
		
		driver.get("http://www.google.ca/");//open application based on URL provided
		
		
		//3.capture title of application
		String appTitle=driver.getTitle();
		System.out.println("Title of application:"+ appTitle);
		
		//4 maximise app
		driver.manage().window().maximize();
		
		if (appTitle.equalsIgnoreCase("google")) {
			System.out.println("Google application is opened");
			
		}else {
			System.out.println("other application is  opened");
			
			
		}
		String appUrl=driver.getCurrentUrl();
		System.out.println("URL of application is:"+appUrl);
		
		if(appUrl.contains("google"))
		{
			System.out.println("URL is correct");
			
		}else {
			System.out.println("URL is wrong");
		}
		
		String updatedText=appUrl.substring(12, 18);
		System.out.println(updatedText);
		
		if(updatedText.equals("google"))
		{
			System.out.println("Pass");
			
		} else {
			System.out.println("fail");
			
		}
		
		//System.out.println(driver.getPageSource());
		
		
		driver.close();//will close application
		}
	

}




	

	
