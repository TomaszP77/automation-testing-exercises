package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import seleniumcodingexercises.utils.BaseTest;

public class MouseActions extends BaseTest {

    @Test
    public void leftClick() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Dropdown menu']")).click();
        WebElement itemToClick = driver.findElement(By.id("my-dropdown-1"));
        Actions actions = new Actions(driver);
        actions.click(itemToClick).perform();
    }

    @Test
    public void contextClick() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Dropdown menu']")).click();
        WebElement itemToClick = driver.findElement(By.id("my-dropdown-2"));
        Actions actions = new Actions(driver);
        actions.contextClick(itemToClick).perform();
    }

    @Test
    public void doubleClick() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Dropdown menu']")).click();
        WebElement itemToClick = driver.findElement(By.id("my-dropdown-3"));
        Actions actions = new Actions(driver);
        actions.doubleClick(itemToClick).perform();
    }
}
