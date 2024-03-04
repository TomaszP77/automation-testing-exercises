package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import seleniumcodingexercises.utils.BaseTest;

public class Iframe extends BaseTest {

    @Test
    public void switchToIframe() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='IFrames']")).click();
        String headerDisplay4 = driver.findElement(By.cssSelector("h1.display-4")).getText();
        System.out.println(headerDisplay4);
        driver.switchTo().frame("my-iframe");
        String bodyText = driver.findElement(By.id("content")).getText();
        System.out.println(bodyText);
        driver.switchTo().defaultContent();
        String headerDisplay6 = driver.findElement(By.cssSelector("h1.display-6")).getText();
        System.out.println(headerDisplay6);
    }
}
