package pages;

import core.Constantes;
import core.DriverFactory;
import core.WaitUtils;
import elements.LoginElementMaps;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends LoginElementMaps {

    public LoginPage() {
        inicializarPageFactory();
    }

    public void abrirPagina(String url) {
        DriverFactory.getDriver().get(url);
    }

    public void preencherUserName(String usuario) {
        WaitUtils.esperarElemento(By.id("user-name"));
        username.clear();
        username.sendKeys(usuario);
    }

    public void preencherPassword(String senha) {
        WaitUtils.esperarElemento(By.id("password"));
        password.clear();
        password.sendKeys(senha);
    }

    public void clicarLogin() {
        WaitUtils.esperarElemento(By.id("login-button"));
        login.click();
    }

    public boolean isPaginaProdutos() {
        return DriverFactory.getDriver().getCurrentUrl().contains("/inventory.html")
                || DriverFactory.getDriver().getTitle().contains("Swag Labs");
    }

    public String obterTextoTituloProdutos() {
        WaitUtils.esperarElemento(By.cssSelector(".title"));
        return titleProducts.getText();
    }

    public void adicionarProdutos(int quantidade) {
        WaitUtils.esperarElemento(By.cssSelector(".inventory_list .inventory_item button"));
        List<WebElement> botoes = DriverFactory.getDriver().findElements(By.cssSelector(".inventory_list .inventory_item button"));

        for (int i = 0; i < Math.min(quantidade, botoes.size()); i++) {
            botoes.get(i).click();
        }
    }

    public int contarItensCarrinho() {
        WaitUtils.esperarElemento(By.cssSelector(".shopping_cart_badge"));
        return Integer.parseInt(cartBadge.getText());
    }

    public boolean isCarrinhoComItens(int quantidadeEsperada) {
        return contarItensCarrinho() == quantidadeEsperada;
    }

    public void abrirPaginaPadrao() {
        abrirPagina(Constantes.URL);
    }
}

