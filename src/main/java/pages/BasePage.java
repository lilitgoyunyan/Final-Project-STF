package pages;

import helpers.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static helpers.WebDriverClass.getDriver;

public abstract class BasePage {
    public static WebDriver webDriver;
    public Actions actions;
    public static String baseURL = "https://www.flightclub.com";


    public BasePage() {
        webDriver = getDriver();
        actions = new Actions(webDriver);
    }

    public abstract String getUrl();

    public void openPageByUrl() {
        webDriver.get(getUrl());
    }

    public boolean isElementDisplayed(By location) {
        try {
            return findElement(location).isDisplayed();
        } catch (Exception exception) {
            return false;
        }
    }

    public WebElement findElement(By location) {
        Waiter.getInstance().isElementDisplayed(location);
        return webDriver.findElement(location);
    }

    public void click(By locator) {
        WebElement element = Waiter.getInstance().waitForElementToBeClickable(locator);
        element.click();
    }

    public void click(By locator, int index) {
        List<WebElement> elements = Waiter.getInstance().waitForElementsToBeVisible(locator);
        elements.get(index).click();
    }

    public String getPageUrl() {
        return webDriver.getCurrentUrl();
    }

    public void writeInput(By locator, String s) {
        WebElement element = Waiter.getInstance().waitForElementToBeVisible(locator);
        element.sendKeys(s);
    }

    public void scrollToElement(By locator) {
        WebElement element = webDriver.findElement(locator);
        actions.moveToElement(element);
        actions.perform();

    }

    public String getText(By locator) {
        return webDriver.findElement(locator).getText();
    }

    public void sendEnter(By location) {
        webDriver.findElement(location).sendKeys(Keys.ENTER);
    }


}