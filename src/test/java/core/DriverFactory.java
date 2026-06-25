package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if(driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static void quitDriver() {

        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}