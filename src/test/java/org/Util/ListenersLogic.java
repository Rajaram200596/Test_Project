package org.Util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersLogic implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case is going to be started !!!!");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("**** Test case got passed ****");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Take screenshot logic intiatited ");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Retry one more time");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("ON START");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("ON FINISH");
		
	}

}
