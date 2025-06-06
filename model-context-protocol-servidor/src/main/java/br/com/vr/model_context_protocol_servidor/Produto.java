package br.com.vr.model_context_protocol_servidor;

import java.math.BigDecimal;

public record Produto(String time, String nome,
                      String descricao,
                      BigDecimal preco, String categoria) {
}
