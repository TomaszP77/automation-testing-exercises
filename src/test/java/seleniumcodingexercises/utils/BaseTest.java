package seleniumcodingexercises.utils;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void openSeleniumDemo() {
        driver.get("http://seleniumdemo.com/");
    }
}