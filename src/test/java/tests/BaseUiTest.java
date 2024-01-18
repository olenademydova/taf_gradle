package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;


import java.time.Duration;

public abstract class BaseUiTest {
    public static final String LOGIN = "standard_user";
    public static final String PASSWORD = "secret_sauce";
    public static final String BASE_URL = "https://www.saucedemo.com/";

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = DriverFactory.getDriverInstance(System.getProperty("qa.browser", "chrome"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
