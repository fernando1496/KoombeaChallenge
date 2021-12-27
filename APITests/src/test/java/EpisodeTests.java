import Base.Base;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;


public class EpisodeTests extends Base {

    @Test(description = "Verify all episodes")
    public void verifyAllEpisodes() {
        logger.log(Status.INFO, "Verify all episodes endpoint");
        VerifyGetEndPoint("https://rickandmortyapi.com/api/episode", 200);
    }

    @Test(description = "Verify specific episodes")
    public void verifySpecificEpisodes() {
        logger.log(Status.INFO, "Verify specific episodes endpoint");
        VerifyGetEndPoint("https://rickandmortyapi.com/api/episode/28", 200);
    }

    @Test(description = "Verify multiple episodes")
    public void verifyMultipleEpisodes() {
        logger.log(Status.INFO, "Verify multiple episodes endpoint");
        VerifyGetEndPoint("https://rickandmortyapi.com/api/episode/10,28", 200);
    }
}
