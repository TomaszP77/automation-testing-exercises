package selenium.seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import selenium.seleniumcodingexercises.utils.BaseTest;

public class GetPageInfo extends BaseTest {

    @Test
    public void getInfo() {
        openSeleniumDemo();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}
