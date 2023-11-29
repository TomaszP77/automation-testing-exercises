package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MyAccountPage {

    @FindBy(id = "reg_email")
    private WebElement emailInput;
    @FindBy(id = "reg_password")
    private WebElement passwordInput;
    @FindBy(name = "register")
    private WebElement registerButton;
    @FindBy(css = "[class=\"woocommerce-password-strength bad\"]")
    private WebElement passwordStrengthBad;

    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;
    }

    public LogInUserPage registerUser(String name, String password) {
        emailInput.sendKeys(name);
        passwordInput.sendKeys(password);
        registerButton.click();
        return new LogInUserPage(driver);
    }

    public String assertionForTooWeekPassword(String name, String password) {
        emailInput.sendKeys(name);
        passwordInput.sendKeys(password);
        registerButton.click();
        return passwordStrengthBad.getText();
    }
}
