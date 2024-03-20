package selenium.genericshopwebapptests.utils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static selenium.genericshopwebapptests.utils.DriverFactory.getDriver;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://skleptest.pl/");
    }

    @AfterAll
    public static void afterAll() {
        driver.quit();
    }

    @AfterEach
    public void afterEach() {
        driver.manage().deleteAllCookies();
    }
}
