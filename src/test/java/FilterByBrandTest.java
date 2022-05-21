
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ProductBrandPage;
import pages.SneakersPage;

public class FilterByBrandTest extends BaseTest {

    //Please run this separately.
    @Test
    public void filterByBrandTest() {
        SneakersPage sneakersPage = new SneakersPage();
        SoftAssert softAssert = new SoftAssert();
        ProductBrandPage productBrandPage;
        sneakersPage.openPageByUrl();
        sneakersPage.isFilterBrandDisplayed();
        sneakersPage.scrollToBrand();
        sneakersPage.clickAdidasButton();
        softAssert.assertEquals(sneakersPage.getPageUrl(), "https://www.flightclub.com/sneakers?brand=adidas");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        productBrandPage = sneakersPage.clickSneakersByIndex(0);
        String productNameText = productBrandPage.getProductName();
        softAssert.assertEquals(productNameText, "adidas");
        softAssert.assertAll();

    }
}
