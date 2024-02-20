package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumcodingexercises.utils.BaseTest;

public class CheckboxRadioButton extends BaseTest {

    @Test
    public void checkboxAction() {
        openSeleniumTestingInputs();

        WebElement checkbox = driver.findElement(By.name("checkbox_input"));
        checkbox.click();
        checkbox.click();
    }

    @Test
    public void radioButtonAction() {
        openSeleniumTestingInputs();

        driver.findElement(By.name("[value='radio2']")).click();
    }
}
