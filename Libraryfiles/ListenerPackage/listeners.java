package ListenerPackage;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ExtentReportPackage.ExtentreportGeneration;
import Utilitypackage.utility;
import baseclasses.BaseClass;

public class listeners extends BaseClass implements ITestListener {
		
	ExtentReports	er = ExtentreportGeneration.reportGen();
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		
		ITestListener.super.onTestStart(result);
		System.out.println("test case is running "+result.getName());

		 test = er.createTest(result.getName());
		
	}@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		System.out.println("Sorry your Test case is fail"+result.getName());
		

		try {
			test.addScreenCaptureFromPath(takesScrrenshot(result.getName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		System.out.println("Congretualation your test case pass"+result.getName());
		test.log(Status.PASS, "Congretualation your test case pass");
		}
		
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		ITestListener.super.onTestSkipped(result);
		System.out.println("your test case "+result.getName()+"is Skipped ");
	test.log(Status.SKIP, "Your test case is Skipped");
	
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		System.out.println("Your test tag is completed");
		er.flush();
	}
	
	
}
