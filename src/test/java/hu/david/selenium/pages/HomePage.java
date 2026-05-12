package hu.david.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By checkboxesLink = By.linkText("Checkboxes");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    public void clickCheckboxes() {
        driver.findElement(checkboxesLink).click();
    }
}