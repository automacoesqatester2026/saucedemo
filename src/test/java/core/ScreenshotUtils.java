package core;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtils {

    public static void capturar(String nome) {
        File screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
        File destino = new File("target/evidencias/" + nome + ".png");
        destino.getParentFile().mkdirs();
        screenshot.renameTo(destino);
    }
}
