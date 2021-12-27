import Base.Base;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;


public class LocationTests extends Base {

    @Test(description = "Verify all locations")
    public void verifyAllLocations() {
        logger.log(Status.INFO, "Verify all locations endpoint");
        VerifyGetEndPoint("https://rickandmortyapi.com/api/location", 200);
    }

    @Test(description = "Verify specific locations")
    public void verifySpecificLocations() {
        logger.log(Status.INFO, "Verify specific locations endpoint");
        VerifyGetEndPoint(" https://rickandmortyapi.com/api/location/3", 200);
    }

    @Test(description = "Verify multiple locations")
    public void verifyMultipleLocations() {
        logger.log(Status.INFO, "Verify multiple locations endpoint");
        VerifyGetEndPoint("https://rickandmortyapi.com/api/location/3,21", 200);
    }


}
