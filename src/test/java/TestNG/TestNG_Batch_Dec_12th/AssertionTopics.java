package TestNG.TestNG_Batch_Dec_12th;

import org.Util.RetryLogic;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTopics {

	String s1 = "Java";
	String s2 = "Selenium";

	@Test(retryAnalyzer = RetryLogic.class)
	public void verification() {

		if (s1.equals(s2)) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case failed");
		}
	}
	
	@Test(retryAnalyzer = RetryLogic.class)
	public void test1()
	{
		System.out.println("Test execution is going to start");
		Assert.assertEquals(s1, s2);
		System.out.println("Test execution is complete");
	}

	@Test(retryAnalyzer = RetryLogic.class)
	private void test2() {
		Assert.assertNotEquals(s2, s1);
		System.out.println("S1 and s2 are not equal");

	}
	
	@Test(retryAnalyzer = RetryLogic.class)
	private void test3() {
		int a = 56, b = 78;
		
		boolean c = a<b;
		
		Assert.assertTrue(c,"Sorry!! True is the expected Result");
		
		System.out.println("Its is correct");

	}
	
	@Test(retryAnalyzer = RetryLogic.class)
	private void test4() {
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(s1, s2);
		
		soft.assertAll();

		System.out.println("Thanks ******");
	}
	
}
