package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

     private static final By emailTextBox = By.id("email");
     private static final By passwordTextBox = By.id("password");
     private static final By btnLoginButton = By.id("loginButton");
     private static final By homePageLogo = By.cssSelector("a.logo");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setEmailAndPassword(String email, String password) {
        setText(emailTextBox, email);
        setText(passwordTextBox, password);
    }
      public void clickLogin(){
        clickElement(btnLoginButton);
        clickElement(homePageLogo);
      }


}
