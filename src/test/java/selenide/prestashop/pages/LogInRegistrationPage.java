package selenide.prestashop.pages;

import static com.codeborne.selenide.Selenide.$;

public class LogInRegistrationPage {

    public void registrationNewAccountLink() {
        $(".no-account").click();
    }
}
