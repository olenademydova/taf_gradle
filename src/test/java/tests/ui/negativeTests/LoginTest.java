package tests.ui.negativeTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

public class LoginTest extends BaseTest {
    public static final String PASSWORD = "secret_sauce";

    @Test
    public void loginTestForBlockedUser(){
        getDriver().get(BASE_URL);
        getDriver().findElement(By.id("user-name")).sendKeys("locked_out_user");
        getDriver().findElement(By.id("password")).sendKeys(PASSWORD);
        getDriver().findElement(By.id("login-button")).click();
        Assertions.assertTrue(getDriver().findElement(By.xpath("//div/h3['data-test=error']")).isDisplayed());
        Assertions.assertTrue(getDriver().findElement(By.id("login-button")).isDisplayed());
    }
}

