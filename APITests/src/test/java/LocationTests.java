import Base.Base;
import com.aventstack.extentreports.Status;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LocationTests extends Base {

    @Test(description = "Verify all locations")
    public void verifyAllLocations() {
        logger.log(Status.INFO, "Verify all locations endpoint");
        Response response = VerifyGetEndPoint("https://rickandmortyapi.com/api/location", 200);
        logger.log(Status.INFO, "Verify that the response is not empty.");
        Assert.assertNotNull(response.getBody());
    }

    @Test(description = "Verify specific locations")
    public void verifySpecificLocations() {
        logger.log(Status.INFO, "Verify specific locations endpoint");
        Response response = VerifyGetEndPoint(" https://rickandmortyapi.com/api/location/3", 200);
        logger.log(Status.INFO, "Verify that the response is not empty.");
        Assert.assertNotNull(response.getBody());
    }

    @Test(description = "Verify multiple locations")
    public void verifyMultipleLocations() {
        logger.log(Status.INFO, "Verify multiple locations endpoint");
        Response response = VerifyGetEndPoint("https://rickandmortyapi.com/api/location/3,21", 200);
        logger.log(Status.INFO, "Verify that the response is not empty.");
        Assert.assertNotNull(response.getBody());
    }


}
