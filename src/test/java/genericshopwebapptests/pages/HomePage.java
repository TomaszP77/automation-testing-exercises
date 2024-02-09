package genericshopwebapptests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {

    @FindBy(css = "li[class=\"top-account\"]")
    private WebElement myAccountLink;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;
    }

    public MyAccountPage myAccount() {
        myAccountLink.click();
        return new MyAccountPage(driver);
    }
}
