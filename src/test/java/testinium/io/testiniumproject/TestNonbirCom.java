package testinium.io.testiniumproject;

import n11Test.BasketPage;
import n11Test.HomePage;
import n11Test.LoginPage;
import n11Test.ProductsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class TestNonbirCom extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    ProductsPage productsPage;
    BasketPage basketPage;

    String _email = "graceeaudrey@gmail.com";
    String _password = "avrilmaster";
    String _productName = "Bilgisayar";



    @Test
    @Order(1)
    public void goLoginPage() throws Exception {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        basketPage = new BasketPage(driver);
        homePage.goToLoginPage();
    }

    @Test
    @Order(2)
    public void login() {
        loginPage.setEmailAndPassword(_email, _password);
        loginPage.clickLogin();

    }

    @Test
    @Order(3)
    public void findProduct() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.typeProductNameOnSearchArea(_productName);
    }


    @Test
    @Order(4)
    public void selectRandomProduct() throws InterruptedException {
        productsPage.selectRandomProduct();
    }

    @Test
    @Order(5)
    public void goBasket() throws InterruptedException {
        productsPage.addToBasketSelectedProduct();

        productsPage.goBasketPage();
    }


    @Test
    @Order(6)
    public void clearBasket() throws Exception {
        Thread.sleep(2000);
        basketPage.clearBasket();
        Thread.sleep(2000);

    }





}
