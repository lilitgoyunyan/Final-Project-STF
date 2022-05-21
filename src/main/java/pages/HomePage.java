package pages;

import locators.HomePageLocators;
import org.openqa.selenium.By;

import static helpers.WebDriverClass.getDriver;

public class HomePage extends BasePage {
    private By searchBar = By.xpath(HomePageLocators.searchBar);
    private By searchBarInput = By.xpath(HomePageLocators.searchBarInput);
    private By viewAllResultsAdidas = By.xpath(HomePageLocators.viewAllResultsAdidas);
    private By noResults = By.cssSelector(HomePageLocators.noResults);
    private By searchBarSneakerButton = By.xpath(HomePageLocators.searchBarSneakerButton);
    private By searchBarEmptyInputResult = By.xpath(HomePageLocators.searchBarEmptyInputResult);
    private By accountsButton = By.xpath(HomePageLocators.accountsButton);


    @Override
    public String getUrl() {
        return baseURL;
    }

    public boolean isSearchBarDisplayed() {
        return isElementDisplayed(searchBar);
    }

    public void clickSearchBar() {
        click(searchBar);
    }

    public void clickAccountsButtonBar() {
        click(accountsButton);
    }

    public void emptyInputSearchBar() {
        writeInput(searchBarInput, "");
    }

    public String getEmptySearchResultText() {
        return getText(searchBarEmptyInputResult);
    }

    public void validInputForSearchBarAirJordan() {
        writeInput(searchBarInput, "Air Jordan");
    }

    public void clickSearchBarSneakerButton() {
        click(searchBarSneakerButton);
    }

    public void validInputForSearchBarNikeUppercase() {
        writeInput(searchBarInput, "NIKE");
    }


    public void invalidInputForSearchBar() {
        writeInput(searchBarInput, "Abibas");
    }

    public void clickViewAllResults() {
        click(viewAllResultsAdidas);
    }

    public String getText() {
        return getDriver().findElement(noResults).getText();
    }


    public void sendKeysForEmptyInput() {
        sendEnter(searchBarInput);
    }

}
