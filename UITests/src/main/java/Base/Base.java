package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {
    protected ExtentReports extent;
    protected ExtentTest logger;
    protected ExtentHtmlReporter htmlReporter;
    protected String htmlReportPath = "reports/report.html";
    protected String testName = "";
    static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> baseCapabilities() throws MalformedURLException {
        File appDirectory = new File("apk");
        File apkFile = new File(appDirectory, "PreciseUnitConversion.apk" );
        DesiredCapabilities desCapabilities = new DesiredCapabilities();
        desCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"DeviceForTestingOne");
        desCapabilities.setCapability(MobileCapabilityType.APP, apkFile.getAbsolutePath());
        desCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        desCapabilities.setCapability("appPackage", "com.ba.universalconverter");
        desCapabilities.setCapability("appActivity","com.ba.universalconverter.MainConverterActivity");
        URL rootUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(rootUrl, desCapabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    @BeforeClass
    public void beforeEveryClass(){
        htmlReporter = new ExtentHtmlReporter(htmlReportPath);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @BeforeMethod
    public void beforeEveryMethod(Method method){
        testName = method.getName();
        logger = extent.createTest(testName);
    }

    @AfterMethod
    public void afterEveryMethod(ITestResult result){
        if(result.getStatus()==ITestResult.FAILURE){
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test Case FAILED", ExtentColor.RED));
        }else{
            logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
        }

    }
    @AfterSuite
    public void afterSuite(){
        extent.flush();
        driver.closeApp();
    }
}
