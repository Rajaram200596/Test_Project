package TestNG.TestNG_Batch_Dec_12th;

import org.testng.annotations.Test;

public class FirstProgram {
	
	@Test(groups = "Sanity")
	public void test1() {
		System.out.println("Hi, This is TestNG Program");

	}
	
	@Test(groups = "Smoke")
	public void test2()
	{
		System.out.println("Sample Run");
	}
	
	

}
