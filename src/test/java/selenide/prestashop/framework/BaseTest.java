package selenide.prestashop.framework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeAll
    public static void beforeAll() {
        Configuration.timeout = 30000;
        open("https://demo.prestashop.com/#/en/front");
    }
}
