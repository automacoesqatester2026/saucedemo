package hooks;

import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void inicio() {
        DriverFactory.getDriver();
    }

    @After
    public void fim() {
        DriverFactory.quitDriver();
    }
}
