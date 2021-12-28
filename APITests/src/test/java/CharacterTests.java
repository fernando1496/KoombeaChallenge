import Base.Base;
import com.aventstack.extentreports.Status;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CharacterTests extends Base {

    @Test(description = "Verify all characters")
    public void verifyAllCharacters() {
        logger.log(Status.INFO, "Verify all characters endpoint");
        Response response = VerifyGetEndPoint("https://rickandmortyapi.com/api/character", 200);
        logger.log(Status.INFO, "Verify that the response is not empty.");
        Assert.assertNotNull(response.getBody());
    }

    @Test(description = "Verify specific character by id")
    public void verifySpecificCharacters() {
        logger.log(Status.INFO, "Verify specific characters endpoint");
        Response response = VerifyGetEndPoint("https://rickandmortyapi.com/api/character/1", 200);
        logger.log(Status.INFO, "Verify that the response is not empty.");
        Assert.assertNotNull(response.getBody());
    }

    @Test(description = "Verify character flter")
    public void verifyCharacterFilter() {
        logger.log(Status.INFO, "Verify character filter endpoint");
        Response response = VerifyGetEndPoint("https://rickandmortyapi.com/api/character/?name=rick&status=alive", 200);
        logger.log(Status.INFO, "Verify that the response is not empty.");
        Assert.assertNotNull(response.getBody());
    }

    @Test(description = "Verify multiple character")
    public void verifyCharacterStatus() {
        logger.log(Status.INFO, "Verify multiple character endpoint");
        Response response = VerifyGetEndPoint("https://rickandmortyapi.com/api/character/1,183", 200);
        logger.log(Status.INFO, "Verify that the response is not empty.");
        Assert.assertNotNull(response.getBody());
    }

}
