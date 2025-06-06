package br.com.vr.model_context_protocol_cliente;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Pergunta(@JsonProperty String texto) {

//    @Override
//    public String toString(){
//        return texto.endsWith("?") ? texto : texto + "?";
//    }
}
