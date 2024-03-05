package seleniumcodingexercises.tests;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import seleniumcodingexercises.utils.BaseTest;

import java.io.File;
import java.io.IOException;

public class Screenshot extends BaseTest {

    @Test
    public void takesScreenshot() throws IOException {
        openSeleniumDemo();

        driver.findElement(By.xpath("//span[text()='Shop']")).click();
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("src/test/resources/screenshot/screenshot.png"));
    }
}
