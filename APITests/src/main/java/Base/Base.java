package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

import static io.restassured.RestAssured.given;

public class Base {
    public static ExtentReports extent;
    public static ExtentTest logger;
    public static ExtentHtmlReporter htmlReporter;
    public static String htmlReportPath = "reports/report.html";
    public static String testName = "";

    @BeforeSuite
    public void beforeSuite() {
        htmlReporter = new ExtentHtmlReporter(htmlReportPath);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }


    @BeforeMethod
    public void beforeEveryMethod(Method method) {
        testName = method.getName();
        logger = extent.createTest(testName);
        logger.assignCategory(this.getClass().getSimpleName());
    }

    @AfterMethod
    public void afterEveryMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            logger.fail(MarkupHelper.createLabel(result.getName() + " Test Case FAILED", ExtentColor.RED));
            logger.fail(result.getThrowable());
        } else {
            logger.pass(MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
        }
    }

    @AfterSuite
    public void afterSuite() {
        extent.flush();
    }

    public static Response VerifyGetEndPoint(String sEndPoint, int expectedResponseCode) {
        RestAssured.defaultParser = Parser.JSON;
        return
                given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                        when().get(sEndPoint).
                        then().assertThat().statusCode(expectedResponseCode).
                        contentType(ContentType.JSON).extract().response();
    }
}
