import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.SearchClassPage;
import pages.SearchResultSneakerPage;
import pages.SearchUpperCaseProductPage;

public class SearchBarTest extends BaseTest {

    @Test
    public void searchBarValidTest() {
        HomePage homePage = new HomePage();
        SearchClassPage searchClassPage = new SearchClassPage();
        homePage.isSearchBarDisplayed();
        homePage.clickSearchBar();
        homePage.validInputForSearchBarAirJordan();
        homePage.clickViewAllResults();
        searchClassPage.clickAirJordanProduct();
        Assert.assertEquals("Air Jordan", searchClassPage.getSearchResultText());
    }

    @Test
    public void searchBarValidTestUpperCase() {
        HomePage homePage = new HomePage();
        SearchClassPage searchClassPage = new SearchClassPage();
        SearchUpperCaseProductPage searchUpperCaseProductPage = new SearchUpperCaseProductPage();
        homePage.isSearchBarDisplayed();
        homePage.clickSearchBar();
        homePage.validInputForSearchBarNikeUppercase();
        homePage.clickViewAllResults();
        searchClassPage.clickNikeProduct();
        Assert.assertEquals("Nike", searchUpperCaseProductPage.getProductBrandNameNIKE());

    }

    @Test
    public void searchBarDropDownItemsFunctionalTest() {
        HomePage homePage = new HomePage();
        homePage.clickSearchBar();
        homePage.clickSearchBarSneakerButton();
        SearchResultSneakerPage searchResultSneakerPage = new SearchResultSneakerPage();
        Assert.assertTrue(searchResultSneakerPage.isSearchBarSneakerButtonSelect());
    }


    @Test
    public void brandFilterWrongInputTest() {
        HomePage homePage = new HomePage();
        homePage.isSearchBarDisplayed();
        homePage.clickSearchBar();
        homePage.invalidInputForSearchBar();
        Assert.assertEquals("No Results", homePage.getText());

    }

    @Test
    public void emptySearchFieldTest() {
        HomePage homePage = new HomePage();
        homePage.isSearchBarDisplayed();
        homePage.clickSearchBar();
        homePage.emptyInputSearchBar();
        homePage.sendKeysForEmptyInput();
        Assert.assertEquals("SEARCH RESULTS FOR 'ALL'", homePage.getEmptySearchResultText());

    }


}
