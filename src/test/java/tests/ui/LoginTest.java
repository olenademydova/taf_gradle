package tests.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.LoginPage;
import tests.BaseUiTest;

public class LoginTest extends BaseUiTest {

    @Test
    public void loginTest() {
        new LoginPage(getDriver()).login();
        Assertions.assertTrue(getDriver().findElement(By.id("shopping_cart_container")).isDisplayed());
    }

    @Test
    public void loginTestForBlockedUser(){
        new LoginPage(getDriver()).login("locked_out_user", "secret_sauce");
        Assertions.assertTrue(getDriver().findElement(By.xpath("//div/h3['data-test=error']")).isDisplayed());
        Assertions.assertTrue(getDriver().findElement(By.id("login-button")).isDisplayed());
    }
}

