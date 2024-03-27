package selenide.prestashop.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SelectedProductPage {

    public void addTooCart() {
        $(".add > .add-to-cart").click();
    }

    public void proceedTooCheckout() {
        $x("//a[text()='Proceed to checkout']").click();
    }
}
