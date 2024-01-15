package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class BaseTest {
    public static final String LOGIN = "standard_user";
    public static final String PASSWORD = "secret_sauce";
    public static final String BASE_URL = "https://www.saucedemo.com/";

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
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
