package Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {

	public static WebDriver driver;
	public Properties prop;

	// public ExtentSparkReporter htmlReporter; // repsosnible for look
	// public ExtentReports extent; // Resposnisble for entries
	// public ExtentTest test; // Respossible for test status pass/fail

	public void browserinitialise() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resource\\data.properties");

		prop = new Properties();
		prop.load(fis);
		// prop.getProperty("browser");
		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("broswer is invalid");
		}
	}

	@BeforeTest
	// public void setup() {

	// htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") +
	// "/test-output/myReport.html");
	// htmlReporter.config().setDocumentTitle("Automation Report");
	// htmlReporter.config().setReportName("Functional Report");
	// htmlReporter.config().setTheme(Theme.DARK);

	// extent = new ExtentReports();
	// extent.attachReporter(htmlReporter);
	// extent.setSystemInfo("hostname", "LocalHost");
	// extent.setSystemInfo("os", "windows10");
	// extent.setSystemInfo("testername", "Navin");
	// }

	@BeforeMethod
	public void launchURL() throws IOException {
		browserinitialise();
		String url = prop.getProperty("url");
		driver.get(url);

	}
	 @AfterMethod
	 public void driverclose() throws IOException {
		 
	  driver.quit();

	 }

	@AfterMethod
	/*
	 * public void tearDown(ITestResult result) throws IOException { if
	 * (result.getStatus() == ITestResult.FAILURE) {
	 * 
	 * test.log(Status.FAIL, "Test CASE Failed is " + result.getName()); // To add
	 * name in extent report
	 * 
	 * test.log(Status.FAIL, "Test CASE Failed is " + result.getThrowable()); // To
	 * throw excpetion
	 * 
	 * String screenshotPath = getScreenshot(driver, result.getName());//
	 * 
	 * test.addScreenCaptureFromPath(screenshotPath); // Adding screenshot inside
	 * report
	 * 
	 * } else if (result.getStatus() == ITestResult.SKIP) { test.log(Status.SKIP,
	 * "test case skipped is" + result.getName());
	 * 
	 * } else if (result.getStatus() == ITestResult.SUCCESS) { test.log(Status.PASS,
	 * "Test case passed is " + result.getName()); } }
	 */

	/*
	 * @AfterTest public void endReport() { extent.flush(); }
	 */

	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {

		String dateFormat = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateFormat + ".png";

		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;

	}

}
