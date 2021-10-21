package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class ProductsPage extends BasePage {

    private static final By getEl = By.xpath("//a[@data-id='489699091']");
    private static final By addToBasketLocator = By.xpath("//a[@title='Sepete Ekle']");
    private static final By goToBasketLocator = By.cssSelector("a.myBasket");




    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    public void selectRandomProduct() throws InterruptedException {

        clickElement(getEl);

    }

    public void addToBasketSelectedProduct() throws InterruptedException {
        clickElement(addToBasketLocator);
        Thread.sleep(3000);
    }

    public void goBasketPage() {
        wait.until(ExpectedConditions.elementToBeClickable(goToBasketLocator)).click();
    }




}
