package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverClass {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://www.flightclub.com/");
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        getDriver().quit();
        driver = null;
    }
}

