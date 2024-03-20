package selenium.seleniumcodingexercises.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.seleniumcodingexercises.utils.BaseTest;

public class GettingTheValueFromTheTextField extends BaseTest {

    @Test
    public void gettingTheValue() {
        openSeleniumDemo();

        driver.findElement(By.id("menu-item-22")).click();
        WebElement valueField = driver.findElement(By.id("reg_email"));
        valueField.sendKeys("abc123@de.fg");

        Assertions.assertEquals("abc123@de.fg", valueField.getAttribute("value"));
    }
}
