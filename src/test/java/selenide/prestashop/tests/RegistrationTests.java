package selenide.prestashop.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selenide.prestashop.framework.BaseTest;
import selenide.prestashop.pages.CreateAnAccountPage;
import selenide.prestashop.pages.HomePage;
import selenide.prestashop.pages.LogInRegistrationPage;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationTests extends BaseTest {

    private HomePage homePage;
    private LogInRegistrationPage logInRegistrationPage;
    private CreateAnAccountPage createAnAccountPage;

    @BeforeEach
    public void beforeEach() {
        homePage = new HomePage();
        logInRegistrationPage = new LogInRegistrationPage();
        createAnAccountPage = new CreateAnAccountPage();
    }

    @Test
    public void registrationUserValidData() {
        homePage.openRegistrationPage();
        logInRegistrationPage.registrationNewAccountLink();
        createAnAccountPage.idGenderRadioButton();
        createAnAccountPage.inputFirstName("Peter ");
        createAnAccountPage.inputLastName("Montfort");
        createAnAccountPage.inputEmail("email@domain.com");
        createAnAccountPage.inputPassword("123ABC!!!defg");
        createAnAccountPage.inputBirthDate("03/07/1978");
        createAnAccountPage.receiveOffersCheckbox();
        createAnAccountPage.termsAndConditionsCheckbox();
        createAnAccountPage.newsletterCheckbox();
        createAnAccountPage.customerDataPrivacy();
        createAnAccountPage.saveCreateAnAccount();

        $(".user-info span").shouldBe(Condition.visible)
                .shouldHave(Condition.partialTextCaseSensitive("Peter Montfort"));
    }

    @Test
    public void userRegistrationWithTooWeakPassword() {
        homePage.openRegistrationPage();
        logInRegistrationPage.registrationNewAccountLink();
        createAnAccountPage.idGenderRadioButton();
        createAnAccountPage.inputFirstName("Peter ");
        createAnAccountPage.inputLastName("Montfort");
        createAnAccountPage.inputEmail("emaildomain.com");
        createAnAccountPage.inputPassword("123");
        createAnAccountPage.inputBirthDate("03/07/1978");
        createAnAccountPage.receiveOffersCheckbox();
        createAnAccountPage.termsAndConditionsCheckbox();
        createAnAccountPage.newsletterCheckbox();
        createAnAccountPage.customerDataPrivacy();
        createAnAccountPage.saveCreateAnAccount();

        $(".password-requirements-length")
                .shouldHave(Condition.partialText("Enter a password between 8 and 72 characters"));
        $(".password-requirements-score")
                .shouldHave(Condition.partialText("The minimum score must be: Strong"));
    }
}

