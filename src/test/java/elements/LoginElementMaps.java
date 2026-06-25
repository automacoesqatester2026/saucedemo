package elements;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementMaps extends BasePage {

    @FindBy(id = "user-name")
    protected WebElement username;

    @FindBy(id = "password")
    protected WebElement password;

    @FindBy(id = "login-button")
    protected WebElement login;

    @FindBy(css = ".title")
    protected WebElement titleProducts;

    @FindBy(css = ".inventory_list .inventory_item button")
    protected WebElement firstAddToCartButton;

    @FindBy(css = ".shopping_cart_badge")
    protected WebElement cartBadge;
}
