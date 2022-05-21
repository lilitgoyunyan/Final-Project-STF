import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.StoresPage;

public class StoresTest extends BaseTest {
    @Test
    public void newYorkStoreTest() {
        StoresPage storesPage = new StoresPage();
        storesPage.openPageByUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(storesPage.isFlightClubShopNewYorkDisplayed(), true);
        softAssert.assertEquals(storesPage.getNewYorkLocationText(), "New York, NY 10003");
    }
    @Test
    public void losAngelesStoreTest() {
        StoresPage storesPage = new StoresPage();
        storesPage.openPageByUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(storesPage.isFlightClubShopLosAngelesDisplayed(), true);
        softAssert.assertEquals(storesPage.getLosAngelesLocationText(), "Los Angeles, CA 90036");
    }
    @Test
    public void MiamiStoreTest() {
        StoresPage storesPage = new StoresPage();
        storesPage.openPageByUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(storesPage.isFlightClubShopMiamiDisplayed(), true);
        softAssert.assertEquals(storesPage.getMiamiLocationText(), "Miami, FL 33137");
    }

}
