package selenide.prestashop.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateAnAccountPage {

    public void idGenderRadioButton() {
        $(By.id("field-id_gender-1")).click();
    }

    public void inputFirstName(String firstName) {
        $("[id=\"field-firstname\"]").setValue(firstName);
    }

    public void inputLastName(String lastName) {
        $("[id=\"field-lastname\"]").setValue(lastName);
    }

    public void inputEmail(String email) {
        $("[id=\"field-email\"]").setValue(email);
    }

    public void inputPassword(String password) {
        $("[id=\"field-password\"]").setValue(password);
    }

    public void inputBirthDate(String birthDate) {
        $("[id=\"field-birthday\"]").setValue(birthDate);
    }

    public void receiveOffersCheckbox() {
        $(By.name("optin")).click();
    }

    public void termsAndConditionsCheckbox() {
        $(By.name("psgdpr")).click();
    }

    public void newsletterCheckbox() {
        $(By.name("newsletter")).click();
    }

    public void customerDataPrivacy() {
        $(By.name("customer_privacy")).click();
    }

    public void saveCreateAnAccount(){
        $("[class=\"btn btn-primary form-control-submit float-xs-right\"]").click();
    }
}
