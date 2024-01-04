package TestNG.TestNG_Batch_Dec_12th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EnviornmentVariables {
	
	WebDriver driver;
	
	@Test
	@Parameters({"email","pwd"})
	private void profile(String x, String y) {
		
		System.out.println("User email id is = " + x);
		System.out.println("User password is = " + y);
	}
	
	@Test
	@Parameters({"browser","url"})
	private void programLogic(String browsername, String siteUrl) {
		if(browsername.equalsIgnoreCase("chrome"))
		{
		 driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(siteUrl);
	}

}
