package seleniumcodingexercises.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driverInstance;

    public static WebDriver getDriver() {
        if (driverInstance == null) {
            driverInstance = selectDriver(DriverType.CHROME);
        }
        return driverInstance;
    }

    private static WebDriver selectDriver(DriverType type) {

        WebDriver driver = null;
        switch (type) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case EDGE:
                driver = new EdgeDriver();
                break;
        }
        return driver;
    }
}
