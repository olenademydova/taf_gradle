package tests.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.BaseUiTest;

public class DeleteItemFromCartTest extends BaseUiTest {

    @Test
    public void deleteItemFromCart() {
        getDriver().get(BASE_URL);
        getDriver().findElement(By.id("user-name")).sendKeys(LOGIN);
        getDriver().findElement(By.id("password")).sendKeys(PASSWORD);
        getDriver().findElement(By.id("login-button")).click();
        getDriver().findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Assertions.assertTrue(getDriver().findElement(By.xpath("//a/span['1']")).isDisplayed());
        getDriver().findElement(By.id("remove-sauce-labs-backpack")).click();
        Assertions.assertTrue(getDriver().findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed());
    }
}
