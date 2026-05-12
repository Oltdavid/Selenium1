package hu.david.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By checkboxesLink = By.linkText("Checkboxes");
    private By add_remove_element = By.linkText("Add/Remove Elements");
    private By dropdownLink = By.linkText("Dropdown");
    private By basicAuthLink = By.linkText("Basic Auth");
    private By heading = By.className("heading");
    private By abTestingLink = By.linkText("A/B Testing");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public boolean isAbTestingLinkDisplayed() {
        return driver.findElement(abTestingLink).isDisplayed();
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    public void clickCheckboxes() {
        driver.findElement(checkboxesLink).click();
    }

    public void clickAdd_remove_element () {
        driver.findElement(add_remove_element).click();
    }

    public void clickDropdownLink () {
        driver.findElement(dropdownLink).click();
    }

    public void clickBasicAuthLink () {
        driver.findElement(basicAuthLink).click();
    }


}