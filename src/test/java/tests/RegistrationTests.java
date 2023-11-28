package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import utils.BaseTest;
import utils.PropertiesLoader;

import java.io.IOException;

public class RegistrationTests extends BaseTest {

    @Test
    public void registrationUserTest() throws IOException {

        String email = PropertiesLoader.loadProperty("db.userEmail");
        String password = PropertiesLoader.loadProperty("db.userPassword");

        String assertion = new HomePage(driver).myAccount()
                .registerUser(email, password)
                .assertionMessageForLogInUser();

        Assertions.assertEquals("edit your password and account details", assertion);
    }
}
