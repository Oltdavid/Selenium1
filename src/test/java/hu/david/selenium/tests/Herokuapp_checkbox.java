package hu.david.selenium.tests;

import hu.david.selenium.pages.CheckboxesPage;
import hu.david.selenium.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Herokuapp_checkbox {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void checkboxTest() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickCheckboxes();

        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.clickCheckbox1();
        checkboxesPage.clickCheckbox2();
        checkboxesPage.clickCheckbox2();

        assertEquals("Checkboxes", checkboxesPage.getHeadingText());
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}