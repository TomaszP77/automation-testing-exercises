package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumcodingexercises.utils.BaseTest;

public class ClickingOnElements extends BaseTest {

    @Test
    public void exerciseOfClickingOnElements() {
        openSeleniumDemo();

        driver.findElement(By.cssSelector(".sek-btn-text")).click();
        driver.findElement(By.xpath("//h2[text()='BDD Cucumber']")).click();
        driver.findElement(By.name("add-to-cart")).click();
        driver.findElement(By.cssSelector("div.woocommerce-message > a.button ")).click();
        driver.findElement(By.cssSelector("td.product-remove [aria-label='Remove this item']")).click();

        WebElement assertion = driver.findElement(By.cssSelector(".cart-empty"));
        Assertions.assertEquals("Your cart is currently empty.", assertion.getText());
    }
}
