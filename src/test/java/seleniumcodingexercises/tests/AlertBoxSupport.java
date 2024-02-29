package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumcodingexercises.utils.BaseTest;

import java.time.Duration;

public class AlertBoxSupport extends BaseTest {

    @Test
    public void launchAlert() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Dialog boxes']")).click();
        driver.findElement(By.id("my-alert")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void launchConfirm() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Dialog boxes']")).click();
        driver.findElement(By.id("my-confirm")).click();
        driver.switchTo().alert().dismiss();
    }

    @Test
    public void launchPrompt() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Dialog boxes']")).click();
        driver.findElement(By.id("my-prompt")).click();
        driver.switchTo().alert().sendKeys("Thomas");
        driver.switchTo().alert().accept();
    }

    @Test
    public void launchModal() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Dialog boxes']")).click();
        driver.findElement(By.id("my-modal")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".modal-footer [data-bs-dismiss=\"modal\"]")));
        driver.findElement(By.cssSelector(".modal-footer [data-bs-dismiss=\"modal\"]")).click();
    }
}
