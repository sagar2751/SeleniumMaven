package extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports 
{
	@Test
	public void report()
	{
		String time = LocalDateTime.now().toString().replace(":", "-");
		//Step 01: create ExtentSparkReporter object
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/extentReport" + time + ".html");
		
		//Step 02: create ExtentReports object
		ExtentReports extReport = new ExtentReports();
		
		//Step 03: attach spark reporter to ExtentReports
		extReport.attachReporter(spark);
		
		//Step 04: create Extent Test object
		ExtentTest test = extReport.createTest("reprot");
		
		//Step 05: call log() to provide status and message
		test.log(Status.PASS, "log message added int extent reports");
		
		//Step 06: call flush() to write report into destination
		extReport.flush();
	}

}
