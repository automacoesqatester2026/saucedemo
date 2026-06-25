package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitUtils {

    public static void esperarElemento(By elemento){

        WebDriverWait wait =
            new WebDriverWait(
                DriverFactory.getDriver(),
                Duration.ofSeconds(10)
            );

        wait.until(
            ExpectedConditions.visibilityOfElementLocated(elemento)
        );
    }
}