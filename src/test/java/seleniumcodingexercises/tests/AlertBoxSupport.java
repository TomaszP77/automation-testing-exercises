package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import seleniumcodingexercises.utils.BaseTest;

public class AlertBoxSupport extends BaseTest {

    @Test
    public void launchAlert() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Dialog boxes']")).click();
        driver.findElement(By.id("my-alert")).click();
        driver.switchTo().alert().accept();
    }
}
