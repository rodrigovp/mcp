package br.com.vr.model_context_protocol_servidor;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ModelContextProtocolServidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelContextProtocolServidorApplication.class, args);
	}

	@Bean
	public ToolCallbackProvider tools(ProdutoService service){
		return MethodToolCallbackProvider.builder()
				.toolObjects(service)
				.build();
	}
}
