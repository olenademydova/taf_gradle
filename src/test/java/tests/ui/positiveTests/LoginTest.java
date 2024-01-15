package tests.ui.positiveTests;

import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.util.StringUtils;
import org.openqa.selenium.By;
import tests.BaseTest;

public class LoginTest extends BaseTest {
        public void loginTest(String login) {
            StringUtils.containsIsoControlCharacter("");
            getDriver().get(BASE_URL);
            getDriver().findElement(By.id("user-name")).sendKeys(login);
            getDriver().findElement(By.id("password")).sendKeys(PASSWORD);
            getDriver().findElement(By.id("login-button")).click();
            Assertions.assertTrue(getDriver().findElement(By.id("shopping_cart_container")).isDisplayed());
        }

    }

