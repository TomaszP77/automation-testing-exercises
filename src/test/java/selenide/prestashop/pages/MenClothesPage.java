package selenide.prestashop.pages;

import static com.codeborne.selenide.Selenide.$;

public class MenClothesPage {

    public void openHummingbirdPrintedShirtPage() {
        $(".product-thumbnail").click();
    }
}
