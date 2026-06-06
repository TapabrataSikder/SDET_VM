package utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseTest;

public class TestListener extends BaseTest implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			ScreenshotUtil.takeScreenshot(driver, result.getName());			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
