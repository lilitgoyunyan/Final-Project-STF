package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static helpers.WebDriverClass.getDriver;

public class Waiter {
    private static Duration DURATION = Duration.ofSeconds(5);

    public static Waiter getInstance() {
        return new Waiter();
    }

    public WebElement isElementDisplayed(By location) {
        return new WebDriverWait(WebDriverClass.getDriver(), DURATION).until(ExpectedConditions.visibilityOfElementLocated(location));
    }

    public WebElement waitForElementToBeClickable(By location) {
        return new WebDriverWait(WebDriverClass.getDriver(), DURATION).until(ExpectedConditions.elementToBeClickable(location));

    }

    public WebElement waitForElementToBeVisible(By location) {
        return new WebDriverWait(getDriver(), DURATION).
                until(ExpectedConditions.visibilityOfElementLocated(location));
    }

    public List<WebElement> waitForElementsToBeVisible(By location) {
        return new WebDriverWait(WebDriverClass.getDriver(), DURATION).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(location));

    }


}


