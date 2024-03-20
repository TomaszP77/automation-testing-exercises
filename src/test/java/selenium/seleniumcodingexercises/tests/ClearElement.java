package selenium.seleniumcodingexercises.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.seleniumcodingexercises.utils.BaseTest;

import java.util.List;
import java.util.stream.Collectors;

public class ClearElement extends BaseTest {

    @Test
    public void clearElement() {
        openSeleniumDemo();

        int randomEmail = (int) (Math.random() * 1000);
        driver.findElement(By.id("menu-item-22")).click();
        driver.findElement(By.id("reg_email")).sendKeys("abcd" + randomEmail + "@efg.hij");
        WebElement password = driver.findElement(By.id("reg_password"));
        WebElement click = driver.findElement(By.name("register"));
        password.sendKeys("1234");
        click.click();
        password.clear();
        password.sendKeys("AbCd$$$1234");
        click.click();

        List<WebElement> assertion = driver.findElements(By.cssSelector(".woocommerce-MyAccount-navigation ul li a"));
        assertion.stream().map(el -> el.getAttribute("textContent")).collect(Collectors.toList());

        Assertions.assertEquals("Dashboard", assertion.get(0).getText());
        Assertions.assertEquals("Orders", assertion.get(1).getText());
        Assertions.assertEquals("Downloads", assertion.get(2).getText());
        Assertions.assertEquals("Addresses", assertion.get(3).getText());
        Assertions.assertEquals("Account details", assertion.get(4).getText());
        Assertions.assertEquals("Logout", assertion.get(5).getText());
    }
}
