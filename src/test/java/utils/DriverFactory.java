package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private DriverFactory() {
    }

    public static WebDriver getDriverInstance(String browser) {
        WebDriver driver = null;
        if ("chrome".equals(browser)) {
            driver = new ChromeDriver();
        }
        if("firefox".equals(browser)){
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
