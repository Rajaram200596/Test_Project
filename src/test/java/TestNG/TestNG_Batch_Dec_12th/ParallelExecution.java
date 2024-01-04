package TestNG.TestNG_Batch_Dec_12th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecution {


	@Test
	private void test1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.goibibo.com/flights");


	}

	@Test
	private void test2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
	
	}
	
	@Test
	private void test3() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
	

	}
	
	@Test
	private void test4() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
	
	
	}
	
	@Test
	private void test5() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
	
	
	}
}
