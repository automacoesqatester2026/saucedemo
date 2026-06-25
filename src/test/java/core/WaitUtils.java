package core;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    public static void esperarElemento(By elemento) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(Constantes.TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }
}
