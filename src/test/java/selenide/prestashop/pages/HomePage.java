package selenide.prestashop.pages;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    public void openRegistrationPage(){
        $x("//span[text()='Sign in']").click();
    }
}