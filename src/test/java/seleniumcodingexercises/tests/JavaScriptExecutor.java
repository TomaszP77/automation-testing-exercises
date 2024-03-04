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

    @Test
    public void executeJavaScriptInsertValue() {
        openSeleniumDemo();

        WebElement shopButton = driver.findElement(By.cssSelector("li.nav__search .czr-overlay-toggle_btn"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", shopButton);
        WebElement insertValue = driver.findElement(By.cssSelector("[aria-describedby=\"lsearch-65e4af7cead48\"]"));
        executor.executeScript("arguments[0].setAttribute('value','BDD');", insertValue);
    }
}
