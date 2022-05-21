package pages;

import locators.SneakersPageLocators;
import org.openqa.selenium.By;

public class SneakersPage extends BasePage {

    private By filterBrand = By.xpath(SneakersPageLocators.filterBrandButton);
    private By adidasButton = By.xpath(SneakersPageLocators.adidasButton);
    private By sneakers = By.cssSelector(SneakersPageLocators.sneakers);
    private By priceButton = By.xpath(SneakersPageLocators.priceButton);
    private By lowerBound = By.cssSelector(SneakersPageLocators.lowerLimitPrice);
    private By upperBound = By.cssSelector(SneakersPageLocators.upperLimitPrice);
    private By applyPriceButton = By.xpath(SneakersPageLocators.applyPriceButton);
    private By elementPrice = By.xpath(SneakersPageLocators.elementPrice);

    public boolean isFilterBrandDisplayed() {
        return isElementDisplayed(filterBrand);
    }

    public void scrollToBrand() {
        scrollToElement(filterBrand);
    }

    public void scrollToPrice() {
        scrollToElement(priceButton);
    }

    public void clickAdidasButton() {
        click(adidasButton);
    }

    public ProductBrandPage clickSneakersByIndex(int index) {
        click(sneakers, index);
        return new ProductBrandPage();
    }

    @Override
    public String getUrl() {
        return baseURL + "/sneakers";
    }

    public void clickPriceButton() {
        click(priceButton);
    }

    public void enterLowerBoundPriceValue() {
        writeInput(lowerBound, "200");
    }

    public void enterUpperBoundPriceValue() {
        writeInput(upperBound, "400");
    }

    public void clickApplyPriceButton() {
        click(applyPriceButton);
    }

    public void scrollToElementButton() {
        scrollToElement(elementPrice);
    }

    public void clickElementButton() {
        click(elementPrice);
    }
}
