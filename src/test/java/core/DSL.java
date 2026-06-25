package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {

    private WebDriver driver() {
        return DriverFactory.getDriver();
    }

    public void clicar(By elemento) {
        driver().findElement(elemento).click();
    }

    public void escrever(By elemento, String texto) {
        driver().findElement(elemento).sendKeys(texto);
    }

    public String obterTexto(By elemento) {
        return driver().findElement(elemento).getText();
    }

    public boolean elementoExiste(By elemento) {
        return !driver().findElements(elemento).isEmpty();
    }
}
