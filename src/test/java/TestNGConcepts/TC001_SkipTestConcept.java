package TestNGConcepts;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TC001_SkipTestConcept {
boolean status=true;
	@Test(priority=1)
	public void loginTest() {
	if(status)
		throw new SkipException("Skipping Test");
	
		System.out.println("logging");
	
	}
		
	@Test(priority=2,dependsOnMethods= {"loginTest"})
	public void bookTickets() {
		System.out.println("Booking");

	
	}
	@Test(priority=3,dependsOnMethods= {"loginTest","bookTickets"})
	public void logout() {
		System.out.println("logging out");
	}}


