package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class FirstCode {
	@Test(priority=0)
	public void f_test() {
		System.out.println("logout");
	}
	@Test(priority=4)
	public void a_test() {
		System.out.println("login");
	}
	@Test(priority=2)
	
	public void b_test() {
		System.out.println("book");
	}
}
