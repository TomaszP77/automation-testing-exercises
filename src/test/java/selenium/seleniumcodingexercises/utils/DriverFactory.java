package selenium.seleniumcodingexercises.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver getDriver() {
        return selectDriver(DriverType.CHROME);
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
