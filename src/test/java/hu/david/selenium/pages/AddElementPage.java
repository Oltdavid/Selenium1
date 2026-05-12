package hu.david.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddElementPage {

    private WebDriver driver;

    private By add_element = By.xpath("//*[@id=\"content\"]/div/button");
    private By delete_element = By.xpath("//*[@id=\"elements\"]/button");


    public AddElementPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddElement() {
        driver.findElement(add_element).click();
    }

    public void clickDeleteElement() {
        driver.findElement(delete_element).click();
    }

    public boolean isDeleteButtonDisplayed() {
        return driver.findElement(delete_element).isDisplayed();
    }

    public boolean isDeleteButtonGone() {
        return driver.findElements(delete_element).isEmpty();
    }


}