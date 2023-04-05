## Teste de API automatizado utilizando Java, RestAssured e JUnit
Este repositório contém exemplos de testes automatizados para uma API utilizando as ferramentas Java, RestAssured e JUnit. Esses testes são executados de forma automatizada para garantir que a API esteja funcionando corretamente e atendendo aos requisitos especificados.

## Pré-requisitos
```bash
JDK 1.8 ou superior instalado  
Maven 3.0 ou superior instalado  
InteliJ IDE ou uma IDE de sua escolha  
```
## Instalação
**Clone o repositório:**
```bash
git clone https://github.com/SavioHolanda/API-Teste-automatizado.git
```

## Estrutura do projeto
```bash
├── src  
│   ├── main  
│   │   ├── java  
│   │   └── resources  
│   └── test  
│       └── java  
│          ├── dataFactory  
│          |    └── ProdutoDataFactory  
│          |    └── UsuarioDataFactory  
│          ├── modulos  
|          |    ├── produto  
|          |    |      └── java  
|          |    |            └── ProdutoTest  
|          |    └── usuario  
|          └── pojo  
|               └── modulos  
|                      ├── ComponentePojo  
|                      ├── ProdutoPojo  
|                      └── UsuarioPojo  
├── lojinha-v2(swagger).yml  
├── pom.xml  
└── README.md  
```
**src/main/java:** contém as classes principais da aplicação, incluindo os modelos de dados e serviços para consumir a API.

**src/main/resources:** contém os recursos da aplicação, como arquivos de configuração.

**src/test/java:** contém as classes de teste automatizado, utilizando a biblioteca JUnit e RestAssured.

**src/test/resources:** contém recursos para os testes, como arquivos JSON de exemplos de requisições e respostas da API.

**pom.xml:** arquivo de configuração do Maven que contém as dependências do projeto.

**README.md:** arquivo com as informações sobre o repositório e instruções para executar os testes.

## Contribuindo
Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões para melhorias, sinta-se à vontade para abrir uma issue ou pull request.

## Licença
Este projeto está licenciado sob a Licença [MIT](https://choosealicense.com/licenses/mit/). Consulte o arquivo LICENSE para obter mais informações.
