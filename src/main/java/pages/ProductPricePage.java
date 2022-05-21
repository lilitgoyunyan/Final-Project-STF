package pages;

import locators.ProductPricePageLocators;
import org.openqa.selenium.By;

//FOR PRICE TEST:
public class ProductPricePage extends BasePage {
    private By productPrice = By.xpath(ProductPricePageLocators.productPrice);

    public String getProductPriceText() {
        return getText(productPrice);
    }

    public boolean checkPrice() {
        String s = getProductPriceText();
        char[] arr = s.toCharArray();
        char[] newArr = new char[arr.length - 2];
        int j = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            newArr[j] = arr[i];
            j++;
        }
        String string = "";
        for (int i = 0; i < newArr.length; i++) {
            string += newArr[i];
        }
        int returnInt = Integer.parseInt(string);
        if (returnInt <= 400 && returnInt >= 200)
            return true;
        else
            return false;

    }

    @Override
    public String getUrl() {
        return baseURL + "/dunk-low-court-purple-dd1391-104";
    }
}
