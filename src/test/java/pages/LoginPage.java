package pages;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static tests.BaseUiTest.BASE_URL;
import static tests.BaseUiTest.LOGIN;
import static tests.BaseUiTest.PASSWORD;

@Getter
public class LoginPage extends BasePage {

    private final By loginField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");

     public LoginPage(WebDriver webDriver) {
         super(webDriver);
     }

    @Step("Login to the site with custom credentials")
    public void login(String login, String password) {
        driver.get(BASE_URL);
        driver.findElement(loginField).sendKeys(login);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    @Step("Login to the site with default credentials")
    public void login(){
        driver.get(BASE_URL);
        driver.findElement(loginField).sendKeys(LOGIN);
        driver.findElement(passwordField).sendKeys(PASSWORD);
        driver.findElement(loginButton).click();
    }
}
