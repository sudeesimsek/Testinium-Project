package testinium.io.testiniumproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {

    WebDriver driver;
    WebDriverWait wait;
    private String baseUrl = "https://www.n11.com";

    @BeforeAll
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(this.baseUrl);
        driver.manage().window().maximize();
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }

}
