package br.com.vr.model_context_protocol_servidor;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProdutoService {

    @Tool(description = "obter todos os produtos")
    public List<Produto> obterProdutos(){
        return List.of(
                new Produto("Palmeiras", "Manual de como não ter mundial", "Um guia completo de como vencer diversos campeonatos....menos o mais importante", new BigDecimal("4000.00"), "mitos"),
                new Produto("Corinthians", "Pacote Fiel: Sofrimento, Milagre e Glória", "Inclui o drama de 2007, o milagre de 2012 e a certeza de que a Fiel nunca abandona. Ideal para quem entende que ser Corinthians é viver intensamente.", new BigDecimal("1000000.00"), "orgulho"),
                new Produto("São Paulo", "Plano de Sócio Torcedor Fantasma", " Ideal para quem só aparece na final. Inclui ingresso virtual e desculpa pronta para sumir na fase ruim.", BigDecimal.ZERO, "Torcida"),
                new Produto("Santos", "Museu do Pelé portátil", "Porque depois do Rei, ficou difícil lembrar de mais alguém.", new BigDecimal("10.58"), "viúvas"));
    }
}
