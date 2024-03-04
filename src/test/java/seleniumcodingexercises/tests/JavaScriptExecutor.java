package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import seleniumcodingexercises.utils.BaseTest;

public class JavaScriptExecutor extends BaseTest {

    @Test
    public void executeJavaScript() {
        openSeleniumDemo();

        WebElement shopButton = driver.findElement(By.cssSelector(".sek-module-inner > .push-effect"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", shopButton);
    }
}
