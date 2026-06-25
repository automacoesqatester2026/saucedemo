package core;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotUtils {

    public static void capturar(String nome){

        File screenshot =
            ((TakesScreenshot)DriverFactory.getDriver())
                .getScreenshotAs(OutputType.FILE);

        File destino =
            new File("evidencias/" + nome + ".png");

        screenshot.renameTo(destino);
    }
}