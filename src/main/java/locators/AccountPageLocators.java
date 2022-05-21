package locators;

public class AccountPageLocators {
    public static final String fullNameSection = "//*[@id=\"__next\"]/div/div[2]/div/div/form/div[1]/div/input";
    public static final String emailSection = "//*[@id=\"__next\"]/div/div[2]/div/div/form/div[2]/div/input";
    public static final String passwordSection = "//*[@id=\"__next\"]/div/div[2]/div/div/form/div[3]/div/input";
    public static final String confirmPasswordSection = "//*[@id=\"__next\"]/div/div[2]/div/div/form/div[4]/div/input";
    public static final String createAccountButton = "[data-qa=\"SecondaryCreateAccountButton\"]";
    public static final String nameIsNotAcceptable = "//*[@id=\"__next\"]/div/div[2]/div/div/form/div[1]/header/span[2]";
    public static final String nameIsNotAcceptableNumberOrChar = "//*[@id=\"__next\"]/div/div[2]/div/div/form/div[1]/header/span[2]";
    public static final String emailIsNotAcceptable = "//*[@id=\"__next\"]/div/div[2]/div/div/form/div[2]/header/span[2]";
    public static final String passwordIsNotAcceptable = "//*[@id=\"__next\"]/div/div[2]/div/div/form/div[3]/header/span[2]";
    public static final String confirmPasswordIsNotAcceptable = "//*[@id=\"__next\"]/div/div[2]/div/div/form/div[4]/header/span[2]";

}
