package com.realestatespotpotter.GenericUtilis;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplimentaion  implements ITestListener{
	ExtentReports report;
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		
		String MethodName = result.getMethod().getMethodName();
		test = report.createTest(MethodName);
		Reporter.log(MethodName+"---TestScript execution starts from here");
		
	}

	public void onTestSuccess(ITestResult result) {
		String MethosName = result.getMethod().getMethodName();
		test.log(Status.PASS, MethosName+"---PASSED---");
		Reporter.log(MethosName+"----Test script executed succesfully");
		
	}

	public void onTestFailure(ITestResult result) {
		
		String FS = result.getMethod().getMethodName();
		String Fscript = FS+new JavaUtils().systemDateFormate();
		test.addScreenCaptureFromPath(Fscript);
		try {
			WebDriverUtils.getScreenShot(BaseClass.sdriver, FS);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(Status.FAIL, result.getThrowable());  // throw the exeption for faild test script
		test.log(Status.FAIL, Fscript+"----FAILED-----");
		Reporter.log(Fscript+"----Testscript execution failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, MethodName+"--SKIPPED---");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(MethodName+"---TestCase Execution is skipped");
		
	}

	public void onStart(ITestContext context) {
		
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("./Extentreport/report.html");
		htmlreport.config().setDocumentTitle("SDET-52");
		htmlreport.config().setTheme(Theme.STANDARD);
		htmlreport.config().setReportName("HRA");
		
		report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("browser name", "chrome");
		report.setSystemInfo("url", "http://rmgtestingserver/domain/House_Rental_Application/");
		report.setSystemInfo("reporter name", "shru");
		
	}

	public void onFinish(ITestContext context) {
		
		//clean older reports
		report.flush();
		
	}
	
	

}
