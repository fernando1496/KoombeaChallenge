package cucumber.stepsdefs;

import Base.Base;
import PageObjects.DimensionsFeatureObjects;
import PageObjects.LeftPanelObjects;
import com.aventstack.extentreports.Status;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class DimensionStepDefinitions extends Base {

    AndroidDriver myDriver = null;
    LeftPanelObjects oLeftPanelObjects = null;
    DimensionsFeatureObjects oDimensionFeatureObjects = null;

    @Before
    public void beforeClass() throws MalformedURLException {
        myDriver = baseCapabilities();
        oLeftPanelObjects = new LeftPanelObjects(myDriver);
        oDimensionFeatureObjects = new DimensionsFeatureObjects(myDriver);
    }


    @Given("^user selected \"(.*)\"$")
    public void user_selected_length(String scenario) {
        System.out.println("TESTFER" + scenario);
        oLeftPanelObjects.navigateInMenuTo(scenario);
    }

    @When("^he select an option on first spinner$")
    public void he_select_an_option_on_first_spinner()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^selects an option on the second spinner$")
    public void selects_an_option_on_the_second_spinner()  {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^the correct result must be displayed on the screen\\.$")
    public void the_correct_result_must_be_displayed_on_the_screen()  {
        // Write code here that turns the phrase above into concrete actions
    }

}
