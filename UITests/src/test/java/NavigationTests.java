import Base.Base;
import PageObjects.DimensionsFeatureObjects;
import PageObjects.LeftPanelObjects;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class NavigationTests extends Base {


    AndroidDriver myDriver = null;
    LeftPanelObjects oLeftPanelObjects = null;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        myDriver = baseCapabilities();
        oLeftPanelObjects = new LeftPanelObjects(myDriver);
    }

    @Test(dataProvider = "leftMenuOptions", dataProviderClass = Data.DataProviders.class, description = "This tests validates that the navigation works as expected")
    private void navigationValidation(String scenario) {
        String actualTitle;
        String expectedTittle = scenario;

        logger.log(Status.INFO, String.format("1. Navigation to '%s' feature in left panel.", scenario));
        oLeftPanelObjects.navigateInMenuTo(scenario);

        logger.log(Status.INFO, String.format("2. Validate '%s' activity title.", scenario));
        actualTitle = oLeftPanelObjects.getTitle(scenario);
        Assert.assertEquals(actualTitle, expectedTittle);
    }
}
