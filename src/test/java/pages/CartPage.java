package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class CartPage extends BasePage {

    private final By checkoutButton = By.id("checkout");
    private final By continueShopping = By.id("continue-shopping");
    private final By removeBackpack = By.id("remove-sauce-labs-backpack");
    private final By removeBikeLight = By.id("remove-sauce-labs-bike-light");
    private final By removeTShirt = By.id("remove-sauce-labs-bolt-t-shirt");
    private final By removeJacket = By.id("remove-sauce-labs-fleece-jacket");
    private final By removeOnesie = By.id("remove-sauce-labs-onesie");
    private final By removeRedTShirt = By.id("remove-test.allthethings()-t-shirt-(red)");

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }
}