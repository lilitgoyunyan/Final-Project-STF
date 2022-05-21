import org.junit.Assert;
import org.junit.Test;
import pages.AccountPage;
import pages.HomePage;

public class AccountLoginTest extends BaseTest {
    //All valid cases together
    @Test
    public void inputAccountInfoValidTest() {
        HomePage homePage = new HomePage();
        homePage.clickAccountsButtonBar();
        AccountPage accountPage = new AccountPage();
        accountPage.clickCreateAccountButton();
        accountPage.clickFullNameSectionBar();
        accountPage.inputTextFullNameSectionValid();
        accountPage.clickEmailSection();
        accountPage.inputTextEmailSectionValid();
        accountPage.clickPasswordSection();
        accountPage.inputPasswordValid();
        accountPage.clickConfirmPasswordSection();
        accountPage.inputConfirmPasswordValid();
        accountPage.clickPasswordSection();
        Assert.assertFalse(accountPage.checkFullNameText());
        Assert.assertFalse(accountPage.checkMailText());
        Assert.assertFalse(accountPage.checkPasswordText());
        Assert.assertFalse(accountPage.checkConfirmPasswordText());

    }

    @Test
    public void inputAccountFullNameInvalidTest() {
        HomePage homePage = new HomePage();
        homePage.clickAccountsButtonBar();
        AccountPage accountPage = new AccountPage();
        accountPage.clickCreateAccountButton();
        accountPage.clickFullNameSectionBar();
        accountPage.inputTextFullNameSectionInvalid();
        accountPage.clickEmailSection();
        Assert.assertTrue(accountPage.checkFullNameText());
    }

    @Test
    public void inputAccountFullNameEmptyInvalidTest() {
        HomePage homePage = new HomePage();
        homePage.clickAccountsButtonBar();
        AccountPage accountPage = new AccountPage();
        accountPage.clickCreateAccountButton();
        accountPage.clickFullNameSectionBar();
        accountPage.inputTextFullNameSectionEmptyInvalid();
        accountPage.clickEmailSection();
        Assert.assertTrue(accountPage.checkFullNameText());
    }

    @Test
    public void inputAccountFullNameNumberInvalidTest() {
        HomePage homePage = new HomePage();
        homePage.clickAccountsButtonBar();
        AccountPage accountPage = new AccountPage();
        accountPage.clickCreateAccountButton();
        accountPage.clickFullNameSectionBar();
        accountPage.inputTextFullNameSectionNumberInvalid();
        accountPage.clickEmailSection();
        Assert.assertTrue(accountPage.checkFullNameNumOrCharText());
    }

    @Test
    public void inputAccountFullNameCharacterInvalidTest() {
        HomePage homePage = new HomePage();
        homePage.clickAccountsButtonBar();
        AccountPage accountPage = new AccountPage();
        accountPage.clickCreateAccountButton();
        accountPage.clickFullNameSectionBar();
        accountPage.inputTextFullNameSectionCharacterInvalid();
        accountPage.clickEmailSection();
        Assert.assertTrue(accountPage.checkFullNameNumOrCharText());
    }

    @Test
    public void inputAccountMailInvalidTest() {
        HomePage homePage = new HomePage();
        homePage.clickAccountsButtonBar();
        AccountPage accountPage = new AccountPage();
        accountPage.clickCreateAccountButton();
        accountPage.clickEmailSection();
        accountPage.inputTextEmailSectionInvalid();
        accountPage.clickPasswordSection();
        Assert.assertTrue(accountPage.checkMailText());
    }

    @Test
    public void inputAccountPasswordInvalidTest() {
        HomePage homePage = new HomePage();
        homePage.clickAccountsButtonBar();
        AccountPage accountPage = new AccountPage();
        accountPage.clickCreateAccountButton();
        accountPage.clickPasswordSection();
        accountPage.inputPasswordInvalid();
        accountPage.clickConfirmPasswordSection();
        Assert.assertTrue(accountPage.checkPasswordText());
    }

    @Test
    public void inputAccountConfirmPasswordInvalidTest() {
        HomePage homePage = new HomePage();
        homePage.clickAccountsButtonBar();
        AccountPage accountPage = new AccountPage();
        accountPage.clickCreateAccountButton();
        accountPage.clickConfirmPasswordSection();
        accountPage.inputConfirmPasswordInvalid();
        accountPage.clickPasswordSection();
        Assert.assertTrue(accountPage.checkConfirmPasswordText());
    }

    //Some of the valid tests: separate
    @Test
    public void inputAccountMailValidTest() {
        HomePage homePage = new HomePage();
        homePage.clickAccountsButtonBar();
        AccountPage accountPage = new AccountPage();
        accountPage.clickCreateAccountButton();
        accountPage.clickEmailSection();
        accountPage.inputTextEmailSectionValid();
        accountPage.clickPasswordSection();
        Assert.assertFalse(accountPage.checkMailText());
    }

    @Test
    public void inputAccountPasswordValidTest() {
        HomePage homePage = new HomePage();
        homePage.clickAccountsButtonBar();
        AccountPage accountPage = new AccountPage();
        accountPage.clickCreateAccountButton();
        accountPage.clickPasswordSection();
        accountPage.inputPasswordValid();
        accountPage.clickConfirmPasswordSection();
        Assert.assertFalse(accountPage.checkPasswordText());
    }


}
