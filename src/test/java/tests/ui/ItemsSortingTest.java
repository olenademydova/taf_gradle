package tests.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.BaseUiTest;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ItemsSortingTest extends BaseUiTest {
    @Test
    public void sortItemsByAlphabet() {
        getDriver().get(BASE_URL);
        getDriver().findElement(By.id("user-name")).sendKeys(LOGIN);
        getDriver().findElement(By.id("password")).sendKeys(PASSWORD);
        getDriver().findElement(By.id("login-button")).click();
        getDriver().findElement(By.className("product_sort_container")).click();
        getDriver().findElement(By.xpath("//select[@class='product_sort_container']/option[@value='az']")).click();
        ///
        List<WebElement> productsList = getDriver().findElements(By.className("inventory_item"));

        List<String> names = productsList.stream()
                .map(n -> n.getText())
                .collect(Collectors.toList()); // ACTUAL

        List<String> sortedNames = names;
        Collections.sort(sortedNames);// EXPECTED

        Assertions.assertEquals(names, sortedNames);
    }
}

