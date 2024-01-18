package tests.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.MainPage;
import tests.BaseUiTest;

public class AddItemToCartTest extends BaseUiTest {

    @Test
    public void addItemToCart() {
        new MainPage(getDriver()).addBackpack();
        Assertions.assertTrue(getDriver().findElement(By.xpath("//a/span['1']")).isDisplayed());
    }
}
