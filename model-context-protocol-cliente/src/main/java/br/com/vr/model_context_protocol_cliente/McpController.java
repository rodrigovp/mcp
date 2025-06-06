package br.com.vr.model_context_protocol_cliente;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class McpController {

    private final ChatClient chatClient;

    public McpController(ChatClient.Builder chatClientBuilder, ToolCallbackProvider tools){
        this.chatClient = chatClientBuilder
                .defaultToolCallbacks(tools)
                .build();
    }

    @GetMapping
    String obterTodosProdutos(){
        return perguntarEObterResposta("obter todos os produtos abaixo de 49 centavos");
    }

    @PostMapping
    String obterProdutosUsandoPerguntaLivre(@RequestBody Pergunta pergunta){
        return perguntarEObterResposta(pergunta.toString());
    }

    private String perguntarEObterResposta(String pergunta){
        Prompt prompt = new PromptTemplate(pergunta).create();

        return this.chatClient
                .prompt(prompt)
                .call()
                .content();
    }
}
