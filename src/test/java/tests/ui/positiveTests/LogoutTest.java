package tests.ui.positiveTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.BaseTest;


public class LogoutTest extends BaseTest {

    @Test
    public void logoutTest() {
        getDriver().get(BASE_URL);
        getDriver().findElement(By.id("user-name")).sendKeys(LOGIN);
        getDriver().findElement(By.id("password")).sendKeys(PASSWORD);
        getDriver().findElement(By.id("login-button")).click();
        getDriver().findElement(By.id("react-burger-menu-btn")).click();
        getDriver().findElement(By.id("logout_sidebar_link")).click();
        Assertions.assertTrue(getDriver().findElement(By.id("login-button")).isDisplayed());
    }
}
