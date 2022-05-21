import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ProductPricePage;
import pages.SneakersPage;

public class FilterByPriceTest extends BaseTest {
    @Test
    public void PriceFiltersTest() {
        SneakersPage sneakersPage = new SneakersPage();
        sneakersPage.openPageByUrl();
        sneakersPage.scrollToPrice();
        sneakersPage.clickPriceButton();
        sneakersPage.enterLowerBoundPriceValue();
        sneakersPage.enterUpperBoundPriceValue();
        sneakersPage.clickApplyPriceButton();
        sneakersPage.scrollToElementButton();
        sneakersPage.clickElementButton();
        ProductPricePage productPricePage = new ProductPricePage();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(productPricePage.getPageUrl(), "https://www.flightclub.com/dunk-low-court-purple-dd1391-104");
        softAssert.assertEquals(true, productPricePage.checkPrice());


    }
}
