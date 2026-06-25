# language: pt
# autor: Carolina Mesquita

Funcionalidade: Login no SauceDemo

Cenário: Login com sucesso e adição de dois produtos distintos à sacola
  Dado que o usuário acessa o site da loja virtual "https://www.saucedemo.com"
  E informa as credenciais válidas:
    | usuário | senha |
    | standard_user | secret_sauce |
  E realiza o login com sucesso
  Quando o usuário adiciona dois produtos distintos à sacola de compras
  Então o sistema deve exibir o número 2 no ícone do carrinho no canto superior direito
  E deve refletir corretamente a quantidade de itens atualmente adicionados