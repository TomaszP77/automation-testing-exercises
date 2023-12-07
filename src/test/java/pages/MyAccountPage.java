package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MyAccountPage {

    @FindBy(css = "[class=\"woocommerce-password-strength bad\"]")
    private static WebElement passwordStrengthBad;
    @FindBy(css = "[class=\"woocommerce-error\"] > li")
    private static WebElement errorMessageNoData;
    @FindBy(id = "reg_email")
    private WebElement emailInput;
    @FindBy(id = "reg_password")
    private WebElement passwordInput;
    @FindBy(name = "register")
    private WebElement registerButton;
    @FindBy(id = "username")
    private WebElement loginEmailInput;
    @FindBy(id = "password")
    private WebElement loginPasswordInput;
    @FindBy(name = "login")
    private WebElement submitLoginButton;

    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;
    }

    public static String assertionForTooWeekPassword() {
        return passwordStrengthBad.getText();
    }

    public static String assertionForWrongData() {
        return errorMessageNoData.getText();
    }

    public LogInUserPage registerUser(String name, String password) {
        emailInput.sendKeys(name);
        passwordInput.sendKeys(password);
        registerButton.click();
        return new LogInUserPage(driver);
    }

    public LogInUserPage logInUser(String email, String password) {
        loginEmailInput.sendKeys(email);
        loginPasswordInput.sendKeys(password);
        submitLoginButton.click();
        return new LogInUserPage(driver);
    }
}
