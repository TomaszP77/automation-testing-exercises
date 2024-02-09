package seleniumcodingexercises.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driverInstance;

    public static WebDriver getDriver() {
        if (driverInstance == null) {
            driverInstance = selectDriver("Chrome");
        }
        return driverInstance;
    }

    private static WebDriver selectDriver(String browser) {

        WebDriver driver = null;
        switch (browser) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Wrong browser name");
        }
        return driver;
    }
}
