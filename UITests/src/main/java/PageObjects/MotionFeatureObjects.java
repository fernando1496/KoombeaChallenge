package PageObjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.List;

public class MotionFeatureObjects {

    AndroidDriver<AndroidElement> myDriver;

    public MotionFeatureObjects(AndroidDriver<AndroidElement> myDriver) {
        this.myDriver = myDriver;
    }

    public void selectUnits(String originalUnit, String unitToConvertTo) {
        // We obtain the 2 spinners, position 0: originalUnit - position 1: unitToConvertTo
        List<AndroidElement> mobileELements = myDriver.findElements(By.xpath("//*[@resource-id='com.ba.universalconverter:id/select_unit_spinner']"));
        for (int i = 0; i < mobileELements.size(); i++) {
            mobileELements.get(i).click();
            MobileElement mobileELement;
            if (i == 0) {
                MobileElement spinnerMenu = myDriver.findElement(By.xpath("//*[@class='android.widget.ListView']"));
                mobileELement = spinnerMenu.findElement(MobileBy
                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\"" + originalUnit + "\"));"));
                mobileELement.click();
            } else if (i == 1) {
                MobileElement spinnerMenu = myDriver.findElement(By.xpath("//*[@class='android.widget.ListView']"));
                mobileELement = spinnerMenu.findElement(MobileBy
                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\"" + unitToConvertTo + "\"));"));
                mobileELement.click();
            }
        }
    }

    public String calculateAndGetTheResults(String value) {
        char[] digitsArray = new char[value.length()];
        MobileElement mobileELement;
        mobileELement = myDriver.findElementByAndroidUIAutomator("text(\"C\")");
        mobileELement.click();

        for (int i = 0; i < value.length(); i++) {
            digitsArray[i] = value.charAt(i);
        }
        for (char singleDigit : digitsArray) {
            mobileELement = myDriver.findElementByAndroidUIAutomator("text(\"" + singleDigit + "\")");
            mobileELement.click();
        }
        mobileELement = myDriver.findElement(By.xpath("//*[@resource-id='com.ba.universalconverter:id/target_value']"));
        return mobileELement.getText();
    }

    public String getTitle(String scenario) {
        MobileElement mobileELement = myDriver.findElementByAndroidUIAutomator("text(\"" + scenario + "\")");
        return mobileELement.getText();
    }

    public boolean validateUnitInSpinner(String unitToValidate, int spinner) {
        boolean isVisible;
        List<AndroidElement> mobileELements = myDriver.findElements(By.xpath("//*[@resource-id='com.ba.universalconverter:id/select_unit_spinner']"));
        mobileELements.get(spinner).click();
        MobileElement spinnerMenu = myDriver.findElement(By.xpath("//*[@class='android.widget.ListView']"));
        MobileElement mobileELement = spinnerMenu.findElement(MobileBy
                .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                        + "new UiSelector().text(\"" + unitToValidate + "\"));"));
        isVisible = mobileELement.isDisplayed();
        mobileELement.click();
        return isVisible;
    }
}
