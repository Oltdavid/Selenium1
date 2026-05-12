package hu.david.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage {

    private WebDriver driver;

    private By successMessage = By.xpath("//p[contains(text(),'Congratulations')]");

    public AuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginWithCredentials(String username, String password) {
        driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}