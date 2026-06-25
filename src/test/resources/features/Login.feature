# language: pt
#autor: Carolina Mesquita

Funcionalidade: Login no SauceDemo

Cenário: Login realizado com sucesso
Dado que o usuário acessa a página de login do SauceDemo
Quando informa o usuário "standard_user"
E informa a senha "secret_sauce"
E clica no botão "Login"
Então deve visualizar a página de produtos
E deve visualizar o título "Products"