package modulos.produto;

import dataFactory.ProdutoDataFactory;
import dataFactory.UsuarioDataFactory;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@DisplayName("Testes de API rest do modulo de Produto")
public class ProdutoTest {
    private String token;
    @BeforeEach
    @Test
    @DisplayName("Gerar token.")
    public void beforeEach() {
        //Configurando os dados da API rest da lojinha
        baseURI = "http://165.227.93.41";
        //port = 8080;
        basePath = "/lojinha";

        //obter o token do usuario admin
        this.token = given()
                .contentType(ContentType.JSON)
                .body(UsuarioDataFactory.loginESenhaDoToken())
                .when()
                .post("/v2/login")
                .then()
                .extract()
                .path("data.token");
    }

    @Test
    @DisplayName("validar os limites proibidos do valor Produto")
    public void testValidarLimiteZeradoProibidoValorProduto(){

        given()
                .contentType(ContentType.JSON)
                .header("token", this.token)
                .body(ProdutoDataFactory.criarProdutoComumComOValorIgualA(0.00))
            .when()
                .post("/v2/produtos")
            .then()
                .assertThat()
                .statusCode(422)
                .body("error", equalTo("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"));
        }
    }