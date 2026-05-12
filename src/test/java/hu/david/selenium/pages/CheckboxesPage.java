package hu.david.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage {

    private WebDriver driver;

    private By checkbox1 = By.xpath("//*[@id='checkboxes']/input[1]");
    private By checkbox2 = By.xpath("//*[@id='checkboxes']/input[2]");
    private By heading   = By.xpath("//h3[text()='Checkboxes']");

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckbox1() {
        driver.findElement(checkbox1).click();
    }

    public void clickCheckbox2() {
        driver.findElement(checkbox2).click();
    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }
}