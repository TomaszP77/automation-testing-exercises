package selenide.prestashop.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    public void openRegistrationPage() {
        $x("//span[text()='Sign in']").click();
    }

    public void moveTheCursorToClothes() {
        SelenideElement element = $("[id=\"category-3\"]");
        actions().moveToElement(element).perform();
    }

    public void clickOnCategoryMen() {
        $("[id=\"category-4\"]").click();
    }
}
