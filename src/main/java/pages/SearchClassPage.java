package pages;

import locators.SearchClassPageLocators;
import org.openqa.selenium.By;

//AFTER ENTERING OUR SEARCH TEXT
public class SearchClassPage extends BasePage {
    private By airJordanProductButton = By.xpath(SearchClassPageLocators.airJordanProductButton);
    private By adidasSearchResultText = By.xpath(SearchClassPageLocators.adidasSearchResultText);
    private By nikeProductButton = By.xpath(SearchClassPageLocators.nikeProductButton);


    @Override
    public String getUrl() {
        return baseURL + "/catalogsearch/result?query=Adidas";
    }

    public void clickAirJordanProduct() {
        click(airJordanProductButton);
    }

    public void clickNikeProduct() {
        click(nikeProductButton);
    }

    public String getSearchResultText() {
        return getText(adidasSearchResultText);
    }


}
