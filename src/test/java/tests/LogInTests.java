package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import utils.BaseTest;
import utils.PropertiesLoader;

import java.io.IOException;

public class LogInTests extends BaseTest {

    @Test
    public void logInUserWithAccountTest() throws IOException {
        String email = PropertiesLoader.loadProperty("db.userEmail");
        String password = PropertiesLoader.loadProperty("db.userPassword");

        String assertion = new HomePage(driver)
                .myAccount()
                .logInUser(email, password)
                .assertionMessageForLogInUser();

        Assertions.assertEquals("edit your password and account details", assertion);
    }
}
