package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BasketPage extends BasePage{

    private static final By clearBasketButtonLocator = By.xpath("//span[text()='Tamam']");

    public BasketPage(WebDriver driver) {
        super(driver);
    }




    public void clearBasket() {

        clickElement(clearBasketButtonLocator);
    }



}
