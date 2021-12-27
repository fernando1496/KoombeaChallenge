package PageObjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;


public class LeftPanelObjects {

    AndroidDriver<AndroidElement> myDriver;

    public LeftPanelObjects(AndroidDriver<AndroidElement> myDriver) {
        this.myDriver = myDriver;
    }

    public void navigateInMenuTo(String menuOption) {
        MobileElement mobileELement = myDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']"));
        mobileELement.click();
        MobileElement leftMenu = myDriver.findElement(By.xpath("//*[@class='android.widget.ListView']"));
        mobileELement = leftMenu.findElement(MobileBy
                .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                        + "new UiSelector().text(\"" + menuOption + "\"));"));
        mobileELement.click();
    }
}
