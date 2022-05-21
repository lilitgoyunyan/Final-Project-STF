package pages;

import locators.StoresPageLocators;
import org.openqa.selenium.By;

public class StoresPage extends BasePage {
    private By flightClubShopNewYork = By.xpath(StoresPageLocators.flightClubShopNewYork);
    private By flightClubShopLosAngeles = By.xpath(StoresPageLocators.flightClubShopLosAngeles);
    private By flightClubShopMiami = By.xpath(StoresPageLocators.flightClubShopMiami);
    private By NYLocation = By.xpath(StoresPageLocators.NYLocation);
    private By MiamiLocation = By.xpath(StoresPageLocators.MiamiLocation);
    private By LALocation = By.xpath(StoresPageLocators.LALocation);


    public boolean isFlightClubShopNewYorkDisplayed() {
        return isElementDisplayed(flightClubShopNewYork);
    }

    public boolean isFlightClubShopLosAngelesDisplayed() {
        return isElementDisplayed(flightClubShopLosAngeles);
    }

    public boolean isFlightClubShopMiamiDisplayed() {
        return isElementDisplayed(flightClubShopMiami);
    }

    public String getNewYorkLocationText() {
        return getText(NYLocation);
    }

    public String getMiamiLocationText() {
        return getText(MiamiLocation);
    }

    public String getLosAngelesLocationText() {
        return getText(LALocation);
    }

    @Override
    public String getUrl() {
        return baseURL + "/storelocator";
    }
}
