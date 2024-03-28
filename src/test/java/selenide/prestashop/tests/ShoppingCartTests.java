package selenide.prestashop.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selenide.prestashop.framework.BaseTest;
import selenide.prestashop.pages.HomePage;
import selenide.prestashop.pages.MenClothesPage;
import selenide.prestashop.pages.SelectedProductPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ShoppingCartTests extends BaseTest {

    private HomePage homePage;
    private MenClothesPage menClothesPage;
    private SelectedProductPage selectedProductPage;

    @BeforeEach
    public void beforeEach() {
        homePage = new HomePage();
        menClothesPage = new MenClothesPage();
        selectedProductPage = new SelectedProductPage();
    }

    @Test
    public void addProductTooCart() {
        homePage.moveTheCursorToClothes();
        homePage.clickOnCategoryMen();
        menClothesPage.openHummingbirdPrintedShirtPage();
        selectedProductPage.addTooCart();
        selectedProductPage.proceedTooCheckout();

        $(".h1").shouldHave(Condition.partialText("Shopping Cart"));
        $(".col-xs-2  .product-price").shouldHave(Condition.partialText("22.94"));
        $x("//a[text()='Proceed to checkout']")
                .shouldHave(Condition.partialText("Proceed to checkout"));
    }

    @Test
    public void deleteProductTooCart() {
        homePage.moveTheCursorToClothes();
        homePage.clickOnCategoryMen();
        menClothesPage.openHummingbirdPrintedShirtPage();
        selectedProductPage.addTooCart();
        selectedProductPage.proceedTooCheckout();
        selectedProductPage.deleteProductFromCart();

        $(".no-items").shouldHave(Condition.partialText("There are no more items in your cart"));
    }
}
