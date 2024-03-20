package selenium.seleniumcodingexercises.utils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterAll
    public static void afterAll() {
        driver.quit();
    }

    public void openSeleniumDemo() {
        driver.get("http://seleniumdemo.com/");
    }

    public void openSeleniumTestingInputs() {
        driver.get("https://www.selenium.dev/selenium/web/inputs.html");
    }

    public void openHandsOnSeleniumWebDriverWithJava() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
    }
}
