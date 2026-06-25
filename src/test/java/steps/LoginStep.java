package steps;

import core.ConfigReader;
import core.MassaDados;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import pages.LoginPage;

public class LoginStep {

    private final LoginPage loginPage = new LoginPage();
    private final ConfigReader configReader = new ConfigReader();

    @Dado("que o usuário acessa o site da loja virtual {string}")
    public void que_o_usuário_acessa_o_site_da_loja_virtual(String url) {
        loginPage.abrirPagina(url);
    }

    @Dado("informa as credenciais válidas:")
    public void informa_as_credenciais_válidas(DataTable dataTable) {
        List<Map<String, String>> linhas = dataTable.asMaps(String.class, String.class);
        Map<String, String> credenciais = linhas.get(0);
        loginPage.preencherUserName(credenciais.get("usuário"));
        loginPage.preencherPassword(credenciais.get("senha"));
    }

    @Dado("realiza o login com sucesso")
    public void realiza_o_login_com_sucesso() {
        loginPage.clicarLogin();
    }

    @Quando("o usuário adiciona dois produtos distintos à sacola de compras")
    public void o_usuário_adiciona_dois_produtos_distintos_à_sacola_de_compras() {
        loginPage.adicionarProdutos(2);
    }

    @Entao("o sistema deve exibir o número {int} no ícone do carrinho no canto superior direito")
    public void o_sistema_deve_exibir_o_número_no_ícone_do_carrinho_no_canto_superior_direito(int quantidadeEsperada) {
        Assert.assertEquals("A quantidade exibida no carrinho não bate com o esperado.", quantidadeEsperada, loginPage.contarItensCarrinho());
    }

    @Entao("deve refletir corretamente a quantidade de itens atualmente adicionados")
    public void deve_refletir_corretamente_a_quantidade_de_itens_atualmente_adicionados() {
        Assert.assertTrue("O carrinho não está refletindo a quantidade esperada.", loginPage.isCarrinhoComItens(2));
    }
}
