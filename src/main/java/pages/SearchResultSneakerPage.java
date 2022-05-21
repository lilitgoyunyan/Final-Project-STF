package pages;

import locators.SearchResultSneakerPageLocators;
import org.openqa.selenium.By;

//FOR SEARCH BAR DROP DOWN FUNCTIONALITY
public class SearchResultSneakerPage extends BasePage {
    private By searchBarSneakerButtonSelect = By.xpath(SearchResultSneakerPageLocators.searchBarSneakerButtonSelect);

    public boolean isSearchBarSneakerButtonSelect() {
        return isElementDisplayed(searchBarSneakerButtonSelect);
    }

    @Override
    public String getUrl() {
        return null;
    }
}
