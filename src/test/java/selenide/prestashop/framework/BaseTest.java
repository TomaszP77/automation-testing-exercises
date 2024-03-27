package selenide.prestashop.framework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    @BeforeAll
    public static void beforeAll() {
        Configuration.timeout = 30000;
        Configuration.holdBrowserOpen = true;
        open("https://demo.prestashop.com/#/en/front");
        switchTo().frame($("#framelive"));
    }
}
