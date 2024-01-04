package TestNG.TestNG_Batch_Dec_12th;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDatas {
	
	@Test(dataProvider = "TestB")
	private void testLogicOne(String i) {
		
		System.out.println("Product Tested = " + i);

	}
	
	@DataProvider(name = "TestA")
	private String[] dataSetOne() {
		return new String[] {"Innova","Jeep","Eritiga","Thar","Dezire"};

	}

	@DataProvider(name = "TestB")
	private String[] dataSetTwo() {
		return new String[] {"Apple","Jeep","Orange","Thar","Lemon"};

	}
}
