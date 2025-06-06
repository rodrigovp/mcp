package br.com.vr.model_context_protocol_cliente;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PerguntaTest {

    @Test
    void inserirInterrogacaoNoFinalCasoNaoExista() throws Exception{
        var texto = "Qual a metade de dois mais dois";
        var pergunta = toPergunta(texto);
        assertThat(pergunta.toString()).isEqualTo(texto + "?");
    }

    @Test
    void naoInserirInterrogacaoNoFinalCasoExista(){
        var texto = "Qual a metade de dois mais dois?";
        var pergunta = toPergunta(texto);
        assertThat(pergunta.toString()).isEqualTo(texto);
    }

    private Pergunta toPergunta(String texto){
        String jsonPergunta = String.format("""
                {
                   "texto": "%s"
                }
                """, texto);
        try {
            return new ObjectMapper().readValue(jsonPergunta, Pergunta.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
