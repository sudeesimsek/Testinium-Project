package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    WebDriverWait wait;

    private final By isHomePageDisplayedElementWithOutLogin = By.xpath("//a[@title='Sipariş Takibi' and contains(text(),'Sipariş Takibi')]");
    private final By isHomePageDisplayedElementWithLogin = By.xpath("//a[@title='Siparişlerim' and contains(text(),'Siparişlerim')]");
    private final By homePageLoginButton = By.xpath("//a[@data-cy='header-login-button' and @type='button']");
    private final By moveMouseToLoginArea = By.xpath("//*[@data-cy='header-user-menu']/div[@title='Giriş Yap']");
    private final By searchInputBox = By.id("searchData");
    private final By searchButton = By.xpath("//button[@data-cy='search-find-button' and @type='submit']");
    private final By acceptCookiesButton = By.xpath("//span[contains(text(),'Kapat')]");

    private final By loginBtn = By.cssSelector("a.btnSignIn");
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void goToLoginPage() throws Exception {
        clickElement(loginBtn);
    }

    public boolean isLogin() {

        return findElement(isHomePageDisplayedElementWithLogin).isDisplayed();
    }

    public void typeProductNameOnSearchArea(String productName) {

        setText(searchInputBox,"Bilgisayar" + Keys.ENTER);
    }

    public void acceptCookies() {

        clickElement(acceptCookiesButton);
    }


}
