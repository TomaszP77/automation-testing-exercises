package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import seleniumcodingexercises.utils.BaseTest;

public class SelectSelenium extends BaseTest {

    @Test
    public void selectByIndex() {
        openSeleniumDemo();

        driver.findElement(By.xpath("//span[text()='Shop']")).click();
        WebElement selectOption = driver.findElement(By.name("orderby"));
        Select sortBy = new Select(selectOption);
        sortBy.selectByIndex(2);
    }

    @Test
    public void selectByVisibleText() {
        openSeleniumDemo();

        driver.findElement(By.xpath("//span[text()='Shop']")).click();
        WebElement selectOption = driver.findElement(By.name("orderby"));
        Select sortBy = new Select(selectOption);
        sortBy.selectByVisibleText("Sort by average rating");
    }
}
