package TestNG.TestNG_Batch_Dec_12th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

@Ignore
public class SeleniumWithAnnotation {
	WebDriver driver;

	@BeforeMethod
	private void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterSuite
	private void shutdown() {
		driver.quit();

	}

	@Test
	private void test1() {

		driver.get("https://www.amazon.in/");

	}

	@Test
	private void test2() {
		driver.get("https://www.facebook.com/");

	}

	@Test
	private void test3() {
		driver.get("https://www.instagram.com/");

	}

}
