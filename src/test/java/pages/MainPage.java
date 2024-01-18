package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static tests.BaseUiTest.BASE_URL;
import static tests.BaseUiTest.LOGIN;
import static tests.BaseUiTest.PASSWORD;

@Getter
public class MainPage extends BasePage {
    private final By loginField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");

    private final By addBackpack = By.id("add-to-cart-sauce-labs-backpack");
    private final By addBikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    private final By addTShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private final By addJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private final By addOnesie = By.id("add-to-cart-sauce-labs-onesie");
    private final By addRedTShirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void addBackpack(){
        driver.get(BASE_URL);
        driver.findElement(loginField).sendKeys(LOGIN);
        driver.findElement(passwordField).sendKeys(PASSWORD);
        driver.findElement(loginButton).click();
        driver.findElement(addBackpack).click();
    }
}
