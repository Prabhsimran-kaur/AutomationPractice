package TestNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DifferentAnnotations {
	@BeforeTest
	public void A() {
		System.out.println("A");
	}
	@BeforeClass
	public void B() {
    System.out.println("B");
		}
	@Test
	public void C() {
	System.out.println("C");
			}
	@Test
	public void D() {
	System.out.println("D");
			}
	@BeforeMethod
	public void E() {
	System.out.println("E");
	}
	@Test			
	public void F() {
	System.out.println("F");
	}
	@AfterMethod
	public void G() {
		System.out.println("G");
	}
	@Test
		public void H() {
			System.out.println("H");
		}
	@AfterClass
			public void I() {
				System.out.println("I");
	
	
		
		
	}

}
