package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import seleniumcodingexercises.utils.BaseTest;

public class MouseActions extends BaseTest {

    @Test
    public void contextClick() {
        openSeleniumDemo();

        WebElement itemToClick = driver.findElement(By.cssSelector("span.sek-btn-text"));
        Actions actions = new Actions(driver);
        actions.contextClick(itemToClick).perform();
    }
}
