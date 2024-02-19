package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import seleniumcodingexercises.utils.BaseTest;

public class KeyboardActions extends BaseTest {

    @Test
    public void keyboardActions() {
        openSeleniumDemo();

        int randomEmail = (int) (Math.random() * 1000);
        driver.findElement(By.id("menu-item-22")).click();
        WebElement emailInput = driver.findElement(By.id("reg_email"));
        emailInput.sendKeys("abcd" + randomEmail + Keys.SPACE + "@efg.hij");
        emailInput.sendKeys(Keys.TAB);
        driver.findElement(By.id("reg_password")).sendKeys(Keys.ENTER);
        for (int i = 0; i < 9; i++) {
            emailInput.sendKeys(Keys.BACK_SPACE);
        }
        emailInput.sendKeys("@efg.hij");
        emailInput.sendKeys(Keys.TAB);
        driver.findElement(By.id("reg_password")).sendKeys(Keys.ENTER);
    }
}
