package hooks;

import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotHook {

    @Before
    public void iniciarTeste() {

        DriverFactory.getDriver();
    }

    @After
    public void finalizarTeste(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot =
                    ((TakesScreenshot) DriverFactory.getDriver())
                            .getScreenshotAs(OutputType.BYTES);

            scenario.attach(
                    screenshot,
                    "image/png",
                    scenario.getName()
            );
        }

        DriverFactory.quitDriver();
    }
}