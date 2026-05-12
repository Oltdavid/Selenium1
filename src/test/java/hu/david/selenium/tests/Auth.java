package hu.david.selenium.tests;

import hu.david.selenium.pages.AuthPage;
import hu.david.selenium.pages.CheckboxesPage;
import hu.david.selenium.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Auth {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void authentication() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickBasicAuthLink();

        AuthPage basicAuthPage = new AuthPage(driver);
        basicAuthPage.loginWithCredentials("admin", "admin");
        assertTrue(basicAuthPage.getSuccessMessage().contains("Congratulations! You must have the proper credentials."));
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}