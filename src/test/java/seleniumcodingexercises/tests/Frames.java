package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumcodingexercises.utils.BaseTest;

public class Frames extends BaseTest {

    @Test
    public void switchToFrameByIndex() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Frames']")).click();
        driver.switchTo().frame(0);
        String headerText = driver.findElement(By.cssSelector("h1[class=\"display-4\"]")).getText();
        System.out.println(headerText);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        String bodyText = driver.findElement(By.cssSelector("p[class=\"lead\"]")).getText();
        System.out.println(bodyText);
        driver.switchTo().defaultContent();
    }

    @Test
    public void switchToFrameByWebElement() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Frames']")).click();
        WebElement frameHeader = driver.findElement(By.cssSelector("[name=\"frame-header\"]"));
        driver.switchTo().frame(frameHeader);
        String headerText = driver.findElement(By.cssSelector("h1[class=\"display-4\"]")).getText();
        System.out.println(headerText);
        driver.switchTo().defaultContent();
        WebElement frameBody = driver.findElement(By.cssSelector("[name=\"frame-body\"]"));
        driver.switchTo().frame(frameBody);
        String bodyText = driver.findElement(By.cssSelector("p[class=\"lead\"]")).getText();
        System.out.println(bodyText);
        driver.switchTo().defaultContent();
    }
}
