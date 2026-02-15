package hu.david.selenium.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleTest {

    @Test
    void openGoogle() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.google.com");
        System.out.println("Page title: " + driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement acceptCookies = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[@id=\"L2AGLb\"]/div")
                )
        );

        acceptCookies.click();

        driver.quit();
        //test3
    }
}
