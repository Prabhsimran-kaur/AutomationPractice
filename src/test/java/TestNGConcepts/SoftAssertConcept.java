package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertConcept {
	/*@Test
	public void HardAssertion() {
		Assert.assertEquals(true, true);
		Assert.assertEquals(100, 20);
		System.out.println("fail");*/
		
		@Test
		public void softAssertion() {
			SoftAssert sa =new SoftAssert();
			sa.assertEquals(true, true);
			sa.assertEquals(100, 20);
			System.out.println("fail");
		
	}

}
