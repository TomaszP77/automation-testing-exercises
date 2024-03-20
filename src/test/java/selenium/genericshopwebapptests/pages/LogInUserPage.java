package selenium.genericshopwebapptests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LogInUserPage {

    @FindBy(xpath = "//a[text()='edit your password and account details']")
    private WebElement assertionMessage;

    public LogInUserPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public String assertionMessageForLogInUser() {
        return assertionMessage.getText();
    }
}
