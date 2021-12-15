package cybersoft.javabackend.girajava14jr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfiguration {
	
	@Bean
	public OpenAPI getOpenApi() {
		return new OpenAPI()
				.info(new Info()
				  .title("Gira Application")
	              .description("Gira Application for Education Purpose")
	              .version("v1.0")
	              .license(new License().name("NO LICENSE").url("http://tuanphan.dev"))
	              .contact(new Contact()
	            		  .email("contact@namleo.dev")
	            		  .name("Tran Hoai Nam")
	            		  .url("http://tuanphan.dev")))
			    .externalDocs(new ExternalDocumentation()
	              .description("Spring Documentation")
	              .url("https://docs.spring.io/spring-framework/docs/current/reference/html/"));
	}
}
