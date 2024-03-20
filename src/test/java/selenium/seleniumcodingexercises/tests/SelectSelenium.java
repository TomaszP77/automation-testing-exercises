package selenium.seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import selenium.seleniumcodingexercises.utils.BaseTest;

import java.util.List;

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

    @Test
    public void selectByValue() {
        openSeleniumDemo();

        driver.findElement(By.xpath("//span[text()='Shop']")).click();
        WebElement selectOption = driver.findElement(By.name("orderby"));
        Select sortBy = new Select(selectOption);
        sortBy.selectByValue("price");
    }

    @Test
    public void selectGetOption() {
        openSeleniumDemo();

        driver.findElement(By.xpath("//span[text()='Shop']")).click();
        WebElement selectOption = driver.findElement(By.name("orderby"));
        Select sortBy = new Select(selectOption);

        List<WebElement> options = sortBy.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
}
