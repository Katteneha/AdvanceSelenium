package Generic_Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsImp implements ITestListener{

	ExtentReports report;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable());
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
		
		System.out.println("<-------  I am Listening   ------->");
		
		String screenShot= null;
		
		try {
			screenShot=WebDriver_Utility.takeScreenshot(BaseClass.sDriver, result.getMethod().getMethodName());
		} 
		
		catch (Throwable e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(screenShot);
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable());
	}

	public void onStart(ITestContext context) {
		
		Java_Utility jlib = new Java_Utility();
		int ranNum= jlib.getRandomNum();
		
		
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentsReportFile/Report"+ranNum+".html");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation Testing");
		spark.config().setReportName("Neha");
		
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Platform", "windows10");
		report.setSystemInfo("Executed By ", "Neha");
		report.setSystemInfo("Reviewed By ", "Vaidika");
	}

	public void onFinish(ITestContext context) {
		report.flush();
	}
	
	

}
