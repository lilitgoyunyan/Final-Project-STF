package pages;

import locators.SearchUpperCaseProductPageLocators;
import org.openqa.selenium.By;

public class SearchUpperCaseProductPage extends BasePage {
    private By productBrandNameNIKE = By.xpath(SearchUpperCaseProductPageLocators.productBrandNameNIKE);

    public String getProductBrandNameNIKE() {
        return getText(productBrandNameNIKE);
    }

    @Override
    public String getUrl() {
        return null;
    }
}
