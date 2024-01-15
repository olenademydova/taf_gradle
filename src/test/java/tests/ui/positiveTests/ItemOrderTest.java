package tests.ui.positiveTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

public class ItemOrderTest extends BaseTest {
    public static final String NAME = "Jane";
    public static final String SURNAME = "Doe";
    public static final String POST_CODE = "74-237";

    @Test
    public void orderItemTest() {
        getDriver().get(BASE_URL);
        getDriver().findElement(By.id("user-name")).sendKeys(LOGIN);
        getDriver().findElement(By.id("password")).sendKeys(PASSWORD);
        getDriver().findElement(By.id("login-button")).click();
        getDriver().findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        getDriver().findElement(By.className("shopping_cart_link")).click();
        Assertions.assertTrue(getDriver().findElement(By.className("inventory_item_name")).isDisplayed());
        getDriver().findElement(By.id("checkout")).click();
        getDriver().findElement(By.id("first-name")).sendKeys(NAME);
        getDriver().findElement(By.id("last-name")).sendKeys(SURNAME);
        getDriver().findElement(By.id("postal-code")).sendKeys(POST_CODE);
        getDriver().findElement(By.id("continue")).click();
        Assertions.assertTrue(getDriver().findElement(By.className("summary_info")).isDisplayed());
        getDriver().findElement(By.id("finish")).click();
        Assertions.assertTrue(getDriver().findElement(By.id("checkout_complete_container")).isDisplayed());
    }
}
