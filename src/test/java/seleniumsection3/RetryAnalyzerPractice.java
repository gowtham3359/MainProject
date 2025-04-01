package seleniumsection3;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice {
	
	@Test(retryAnalyzer=genericUtility.RetryAnalyzerImplementation.class)
	public void sample() {
		System.out.println("Hi");
		Assert.fail();
	}

}
