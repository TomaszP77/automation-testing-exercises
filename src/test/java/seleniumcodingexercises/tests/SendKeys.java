package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import seleniumcodingexercises.utils.BaseTest;

public class SendKeys extends BaseTest {

    @Test
    public void exerciseOfClickingOnElements() {
        openSeleniumDemo();

        int randomEmail = (int) (Math.random() * 1000);
        driver.findElement(By.id("menu-item-22")).click();
        driver.findElement(By.id("reg_email")).sendKeys("abcd" + randomEmail + "@efg.hij");
        driver.findElement(By.id("reg_password")).sendKeys("password1234567!!!");
        driver.findElement(By.name("register")).click();
    }
}
