package seleniumsection3;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class HardAssertionPractice {
	
	@Test
	public void strictLevelComparison() {
		String expectedName="Raja";
		String actualName="Raja";
		Assert.assertEquals(actualName, expectedName);
//		Assert.assertTrue(actualName.equals(expectedName));
//		Assert.assertEquals(actualName.equals(expectedName), true);
		System.out.println("HardAssertion strict Level completed");
	}
	
	@Test
	public void containsLevelComparison() {
		String a1="Don";
		String a2="London";
		
		Assert.assertTrue(a2.contains(a1));
		System.out.println("Hard Assertion contains Level Completed");
		
		
	}

}
