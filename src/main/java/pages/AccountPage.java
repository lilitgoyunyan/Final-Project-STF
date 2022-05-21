package pages;

import locators.AccountPageLocators;
import org.openqa.selenium.By;

public class AccountPage extends BasePage {
    private By fullNameSection = By.xpath(AccountPageLocators.fullNameSection);
    private By emailSection = By.xpath(AccountPageLocators.emailSection);
    private By passwordSection = By.xpath(AccountPageLocators.passwordSection);
    private By confirmPasswordSection = By.xpath(AccountPageLocators.confirmPasswordSection);
    private By createAccountButton = By.cssSelector(AccountPageLocators.createAccountButton);
    private By nameIsNotAcceptable = By.xpath(AccountPageLocators.nameIsNotAcceptable);
    private By emailIsNotAcceptable = By.xpath(AccountPageLocators.emailIsNotAcceptable);
    private By nameIsNotAcceptableNumberOrChar = By.xpath(AccountPageLocators.nameIsNotAcceptableNumberOrChar);
    private By passwordIsNotAcceptable = By.xpath(AccountPageLocators.passwordIsNotAcceptable);
    private By confirmPasswordIsNotAcceptable = By.xpath(AccountPageLocators.confirmPasswordIsNotAcceptable);

    public void clickEmailSection() {
        click(emailSection);
    }

    public void clickPasswordSection() {
        click(passwordSection);
    }

    public void clickConfirmPasswordSection() {
        click(confirmPasswordSection);
    }

    public void clickFullNameSectionBar() {
        click(fullNameSection);
    }

    public boolean checkFullNameText() {
        if (isElementDisplayed(nameIsNotAcceptable)) {
            return true;
        }
        return false;
    }

    public boolean checkPasswordText() {
        if (isElementDisplayed(passwordIsNotAcceptable)) {
            return true;
        }
        return false;
    }

    public boolean checkFullNameNumOrCharText() {
        if (isElementDisplayed(nameIsNotAcceptableNumberOrChar)) {
            return true;
        }
        return false;
    }

    public boolean checkMailText() {
        if (isElementDisplayed(emailIsNotAcceptable)) {
            return true;
        }
        return false;
    }

    public boolean checkConfirmPasswordText() {
        if (isElementDisplayed(confirmPasswordIsNotAcceptable)) {
            return true;
        }
        return false;
    }

    public void clickCreateAccountButton() {
        click(createAccountButton);
    }

    public void inputTextFullNameSectionValid() {
        writeInput(fullNameSection, "Lilit Goyunyan");
    }

    public void inputTextFullNameSectionInvalid() {
        writeInput(fullNameSection, "LilitGoyunyan");
    }

    public void inputTextFullNameSectionEmptyInvalid() {
        writeInput(fullNameSection, "");
    }

    public void inputTextFullNameSectionNumberInvalid() {
        writeInput(fullNameSection, "Lilit1");
    }

    public void inputTextFullNameSectionCharacterInvalid() {
        writeInput(fullNameSection, "Lilit!");
    }

    public void inputTextEmailSectionValid() {
        writeInput(emailSection, "lilit@gmail.com");
    }

    public void inputTextEmailSectionInvalid() {
        writeInput(emailSection, "lilitgmail.com");
    }

    public void inputPasswordInvalid() {
        writeInput(passwordSection, "");
    }

    public void inputPasswordValid() {
        writeInput(passwordSection, "password");
    }

    public void inputConfirmPasswordInvalid() {
        writeInput(confirmPasswordSection, "");
    }

    public void inputConfirmPasswordValid() {
        writeInput(confirmPasswordSection, "password");
    }

    @Override
    public String getUrl() {
        return null;
    }
}
