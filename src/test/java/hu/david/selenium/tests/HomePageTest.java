package hu.david.selenium.tests;

import hu.david.selenium.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void homepage1() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        assertEquals("Welcome to the-internet", homePage.getHeadingText());

    }

    @Test
    void homepage2() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        assertTrue(homePage.isAbTestingLinkDisplayed());
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}