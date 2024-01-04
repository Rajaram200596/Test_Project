package org.Util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {

	private int startCount = 1;
	private final int maxRetryCount = 3;

	@Override
	public boolean retry(ITestResult result) {

		if (startCount <= maxRetryCount) {
			startCount++;
			return true;
		}

		return false;
	}

}
