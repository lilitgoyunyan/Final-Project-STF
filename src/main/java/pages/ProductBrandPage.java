package pages;


import locators.ProductBrandPageLocators;
import org.openqa.selenium.By;

//FOR BRAND TEST:
public class ProductBrandPage extends BasePage {

    private By productName = By.cssSelector(ProductBrandPageLocators.productName);


    public String getProductName() {
        return getText(productName);
    }

    @Override
    public String getUrl() {
        return null;
    }
}
