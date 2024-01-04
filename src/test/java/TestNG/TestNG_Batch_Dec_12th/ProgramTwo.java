package TestNG.TestNG_Batch_Dec_12th;

import org.testng.annotations.Test;

public class ProgramTwo {

	@Test(priority = 1,groups = "Sanity")
	private void browserLaunch() {
		System.out.println("Open an chrome Browser");
	}

	@Test(dependsOnMethods = "browserLaunch")
	private void loadURL() {
		System.out.println("Driver.get -> So that url will be launched");

	}

	@Test(priority = 0,groups = "Sanity")
	private void loginCredentials() {
		System.out.println("Provide Username and password");

	}

	@Test(invocationCount = 10)
	private void submitButton() {
		System.out.println("Click the submit button");

	}

	@Test(priority = 5)
	private void verifyHomePage() {
		System.out.println("User can able to see home page ");

	}

	@Test(priority = 6,groups = "Sanity")
	private void shutdownApp() {
		System.out.println("driver.quit()");

	}

}
