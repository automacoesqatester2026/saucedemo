package core;

import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected DSL dsl = new DSL();

    protected void inicializarPageFactory() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
}
