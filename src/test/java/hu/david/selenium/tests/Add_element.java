package hu.david.selenium.tests;

import hu.david.selenium.pages.AddElementPage;
import hu.david.selenium.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Add_element {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void addElement_deleteButtonAppearsTest() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickAdd_remove_element();

        AddElementPage addElementPage = new AddElementPage(driver);
        addElementPage.clickAddElement();

        assertTrue(addElementPage.isDeleteButtonDisplayed());
    }

    @Test
    void deleteElement_deleteButtonDisappearsTest() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickAdd_remove_element();

        AddElementPage addElementPage = new AddElementPage(driver);
        addElementPage.clickAddElement();
        addElementPage.clickDeleteElement();

        assertTrue(addElementPage.isDeleteButtonGone());
    }

    @AfterEach
    void tearDown() {
         driver.quit();
    }
}