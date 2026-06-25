package hooks;

import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void iniciarTeste() {

        DriverFactory.getDriver();
    }

    @After
    public void finalizarTeste() {

        DriverFactory.quitDriver();
    }
}