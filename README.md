# SauceDemo - Projeto Maven

Projeto de automação de testes para a aplicação SauceDemo.

## Estrutura do Projeto

```
saucedemo/
├── src/
│   ├── main/
│   │   ├── java/           # Código-fonte principal
│   │   └── resources/      # Recursos da aplicação
│   └── test/
│       ├── java/           # Testes automatizados
│       └── resources/      # Recursos dos testes
├── pom.xml                 # Configuração Maven
└── README.md               # Este arquivo
```

## Pré-requisitos

- Java 11+
- Maven 3.6+

## Dependências

- **Selenium**: Automação de testes web
- **WebDriverManager**: Gerenciamento automático de drivers
- **JUnit 4**: Framework de testes
- **Log4j**: Logging

## Compilar o Projeto

```bash
mvn clean compile
```

## Executar Testes

```bash
mvn test
```

## Empacotar

```bash
mvn clean package
```

## Limpar

```bash
mvn clean
```

## Como Usar

1. Clone ou copie o projeto para sua máquina
2. Navegue até a pasta do projeto: `cd saucedemo`
3. Execute: `mvn clean test`

## Próximos Passos

- Criar classes de teste em `src/test/java/`
- Adicionar classes de suporte em `src/main/java/`
- Configurar logs em `src/test/resources/`
