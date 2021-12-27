import Base.Base;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;


public class CharacterTests extends Base {

    @Test(description = "Verify all characters")
    public void verifyAllCharacters() {
        logger.log(Status.INFO, "Verify all characters endpoint");
        VerifyGetEndPoint("https://rickandmortyapi.com/api/character", 200);
    }

    @Test(description = "Verify specific character by id")
    public void verifySpecificCharacters() {
        logger.log(Status.INFO, "Verify specific characters endpoint");
        VerifyGetEndPoint("https://rickandmortyapi.com/api/character/1", 200);
    }

    @Test(description = "Verify character flter")
    public void verifyCharacterFilter() {
        logger.log(Status.INFO, "Verify character filter endpoint");
        VerifyGetEndPoint("https://rickandmortyapi.com/api/character/?name=rick&status=alive", 200);
    }

    @Test(description = "Verify multiple character")
    public void verifyCharacterStatus() {
        logger.log(Status.INFO, "Verify multiple character endpoint");
        VerifyGetEndPoint("https://rickandmortyapi.com/api/character/1,183", 200);
    }

}
