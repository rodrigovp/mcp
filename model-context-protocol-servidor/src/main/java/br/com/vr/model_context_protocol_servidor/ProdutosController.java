package br.com.vr.model_context_protocol_servidor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    private ProdutoService service;

    public ProdutosController(ProdutoService service){
        this.service = service;
    }

    @GetMapping
    public List<Produto> obterProdutos(){
        return service.obterProdutos();
    }
}
