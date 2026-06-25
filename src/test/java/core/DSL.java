package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {

    public void clicar(By elemento){
        DriverFactory.getDriver().findElement(elemento).click();
    }

    public void escrever(By elemento, String texto){
        DriverFactory.getDriver().findElement(elemento).sendKeys(texto);
    }

    public String obterTexto(By elemento){
        return DriverFactory.getDriver().findElement(elemento).getText();
    }

    public boolean elementoExiste(By elemento){
        return DriverFactory.getDriver()
                .findElements(elemento)
                .size() > 0;
    }
}