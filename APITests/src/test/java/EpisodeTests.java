import Base.Base;
import com.aventstack.extentreports.Status;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class EpisodeTests extends Base {

    @Test(description = "Verify all episodes")
    public void verifyAllEpisodes() {
        logger.log(Status.INFO, "Verify all episodes endpoint");
        Response response = VerifyGetEndPoint("https://rickandmortyapi.com/api/episode", 200);
        logger.log(Status.INFO, "Verify that the response is not empty.");
        Assert.assertNotNull(response.getBody());
    }

    @Test(description = "Verify specific episodes")
    public void verifySpecificEpisodes() {
        logger.log(Status.INFO, "Verify specific episodes endpoint");
        Response response = VerifyGetEndPoint("https://rickandmortyapi.com/api/episode/28", 200);
        logger.log(Status.INFO, "Verify that the response is not empty.");
        Assert.assertNotNull(response.getBody());
    }

    @Test(description = "Verify multiple episodes")
    public void verifyMultipleEpisodes() {
        logger.log(Status.INFO, "Verify multiple episodes endpoint");
        Response response = VerifyGetEndPoint("https://rickandmortyapi.com/api/episode/10,28", 200);
        logger.log(Status.INFO, "Verify that the response is not empty.");
        Assert.assertNotNull(response.getBody());
    }
}
