package hu.david.selenium.tests;

import hu.david.selenium.pages.CheckboxesPage;
import hu.david.selenium.pages.DropdownPage;
import hu.david.selenium.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dropdown {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void selectOption1_isSelected() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickDropdownLink();

        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.selectOption1();
        assertEquals("Option 1", dropdownPage.getSelectedOption());
        System.out.println("Selected Option in the first test: " + dropdownPage.getSelectedOption());
    }

    @Test
    void selectOption2_isSelected() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickDropdownLink();

        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.selectOption2();
        System.out.println("Selected Option in the second test: " + dropdownPage.getSelectedOption());
        assertEquals("Option 2", dropdownPage.getSelectedOption());
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
