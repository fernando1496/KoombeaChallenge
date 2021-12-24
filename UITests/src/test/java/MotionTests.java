import Base.Base;
import PageObjects.DimensionsFeatureObjects;
import PageObjects.LeftPanelObjects;
import PageObjects.MotionFeatureObjects;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class MotionTests extends Base {


    AndroidDriver myDriver = null;
    LeftPanelObjects oLeftPanelObjects = null;
    MotionFeatureObjects oMotionFeatureObjects = null;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        myDriver = baseCapabilities();
        oLeftPanelObjects = new LeftPanelObjects(myDriver);
        oMotionFeatureObjects = new MotionFeatureObjects(myDriver);
    }

    @Test(dataProvider = "motionValues", dataProviderClass = Data.DataProviders.class, description = "This tests validates the input type from the text view.")
    private void motionFeatureCalculation(String scenario, String originalUnit, String conversionUnit, String quantityToConvert, String result) {
        String actualTitle;
        String expectedTittle = scenario;

        logger.info(String.format("INFO: Original Unit: %s, Conversion Unit: %s, Quantity: %s.", originalUnit, conversionUnit, quantityToConvert));
        logger.log(Status.INFO, String.format("1. Navigation to '%s' feature in left panel.",scenario));
        oLeftPanelObjects.navigateInMenuTo(scenario);

        logger.log(Status.INFO, String.format( "2. Validate '%s' activity title.", scenario));
        actualTitle = oMotionFeatureObjects.getTitle(scenario);
        Assert.assertEquals(actualTitle,expectedTittle);

        logger.log(Status.INFO, String.format("3. Select %s as original unit and %s as the conversion unit.", originalUnit, conversionUnit));
        oMotionFeatureObjects.selectUnits(originalUnit,conversionUnit);

        logger.log(Status.INFO, String.format("4.Clear previous data and validate converting %s %s to %s.", quantityToConvert, originalUnit, conversionUnit));
        String conversionResult = oMotionFeatureObjects.calculateAndGetTheResults(quantityToConvert);

        logger.log(Status.INFO, "5. Validate conversion result.");
        Assert.assertEquals(conversionResult,result);
    }

    @Test(dataProvider = "motionConversionUnits", dataProviderClass = Data.DataProviders.class, description = "Validate that the units are being displayed on the spinner")
    private void verifyMotionConversionUnits(String scenario, String unit) {
        boolean result;
        logger.log(Status.INFO, String.format("1. Navigation to '%s' feature in left panel.",scenario));
        oLeftPanelObjects.navigateInMenuTo(scenario);

        logger.info(String.format("INFO: Unit to validate: %s", unit));
        logger.log(Status.INFO, String.format( "2. Validate unit %s in first spinner.", unit));
        result = oMotionFeatureObjects.validateUnitInSpinner(unit, 0);
        Assert.assertTrue(result);
    }
}
