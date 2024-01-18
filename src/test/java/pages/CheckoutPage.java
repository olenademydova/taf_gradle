package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutPage extends BasePage {

    private final By firstNameField = By.id("first-name");
    private final By lastNameField = By.id("password");
    private final By postCode = By.id("postal-code");
    private final By continueButton = By.id("continue");

    @FindBy
    private WebElement element;

    public CheckoutPage(WebDriver webDriver) {
        super(webDriver);
    }
}