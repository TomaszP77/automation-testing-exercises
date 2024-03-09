package seleniumcodingexercises.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import seleniumcodingexercises.utils.BaseTest;

public class MouseActions extends BaseTest {

    @Test
    public void leftClick() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Dropdown menu']")).click();
        WebElement itemToClick = driver.findElement(By.id("my-dropdown-1"));
        Actions actions = new Actions(driver);
        actions.click(itemToClick).perform();
    }

    @Test
    public void contextClick() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Dropdown menu']")).click();
        WebElement itemToClick = driver.findElement(By.id("my-dropdown-2"));
        Actions actions = new Actions(driver);
        actions.contextClick(itemToClick).perform();
    }

    @Test
    public void doubleClick() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Dropdown menu']")).click();
        WebElement itemToClick = driver.findElement(By.id("my-dropdown-3"));
        Actions actions = new Actions(driver);
        actions.doubleClick(itemToClick).perform();
    }

    @Test
    public void moveToElement() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Mouse over']")).click();
        WebElement compassItem = driver.findElement(By.cssSelector("[src='img/compass.png']"));
        WebElement calendarItem = driver.findElement(By.cssSelector("[src='img/calendar.png']"));
        WebElement awardItem = driver.findElement(By.cssSelector("[src='img/award.png']"));
        WebElement landscapeItem = driver.findElement(By.cssSelector("[src='img/landscape.png']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(compassItem).perform();
        actions.moveToElement(calendarItem).perform();
        actions.moveToElement(awardItem).perform();
        actions.moveToElement(landscapeItem).perform();
    }

    @Test
    public void dragAndDrop() {
        openHandsOnSeleniumWebDriverWithJava();

        driver.findElement(By.xpath("//a[text()='Drag and drop']")).click();
        WebElement draggableStart = driver.findElement(By.id("draggable"));
        WebElement droppableFinish = driver.findElement(By.id("target"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggableStart, droppableFinish).perform();
    }
}
