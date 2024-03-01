package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
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
        String headerText2 = driver.findElement(By.cssSelector("p[class=\"lead\"]")).getText();
        System.out.println(headerText2);
        driver.switchTo().defaultContent();
    }
}
