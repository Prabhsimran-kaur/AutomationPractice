package SuiteA;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Priorities {
	 @Test(priority=1)
	public void B(){
		System.out.println("logging into app");
		
	}
	 @Test(priority=2)
	public void Z(){
		System.out.println("book");
	}
	 @Test(priority=3)
	public void A(){
		System.out.println("close");

}}
