package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsMethods {
@Test(priority=1)
	  public void loginTest() {
		  System.out.println("Logging into app");
		  //Assert.assertEquals("sign in", "login");
		  Assert.assertTrue(false);
		  
	  }
@Test(priority=2,dependsOnMethods="loginTest")
public void bookTickets() {
	System.out.println("book");
	Assert.assertEquals("abc", "Booking");
}
@Test(priority=3,dependsOnMethods= {"loginTest","bookTickets"})
	  public void logout() {
		  System.out.println("logout");
	  }
	  
}
