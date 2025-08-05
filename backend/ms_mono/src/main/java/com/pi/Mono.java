package com.pi;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pi.utils.services.ResourceLoader;

@SpringBootApplication
public class Mono {
    private static final Logger LOG = LoggerFactory.getLogger(Mono.class);

    @Autowired private ResourceLoader resourceLoader;

    @Value("${microservice.mono.routes.info.title}") String title;
    @Value("${microservice.mono.routes.info.version}") String version;
    @Value("${microservice.mono.routes.info.description}") String description;
    @Value("${microservice.mono.routes.info.contact.email}") String email;

    public static void main(String[] args) {
        SpringApplication.run(Mono.class, args);
        LOG.info("MONO SERVICE - RUNNING");
    }

    @Bean
    public GroupedOpenApi infoAuthResources() {
        String[] paths = { "/auth/v1/**" };
        String description = resourceLoader.loadResourceAsString("openapi/auth-description.md");
        
        var info = new Info()
                .title("1 - MS Auth v1")
                .version("1.0.0")
                .description(description)
                .contact(new Contact().email(email));

        return GroupedOpenApi.builder()
                .group("1 - MS Auth v1")
                .addOpenApiCustomizer(openApi -> openApi.info(info))
                .pathsToMatch(paths)
                .build();
    }

    @Bean
    public GroupedOpenApi infoUserResources() {
        String[] paths = { "/user/v1/**" };
        String description = resourceLoader.loadResourceAsString("openapi/user-description.md");
        
        var info = new Info()
                .title("2 - MS User v1")
                .version("1.0.0")
                .description(description)
                .contact(new Contact().email(email));

        return GroupedOpenApi.builder()
                .group("2 - MS User v1")
                .addOpenApiCustomizer(openApi -> openApi.info(info))
                .pathsToMatch(paths)
                .build();
    }

    @Bean
    public GroupedOpenApi infoQuizResources() {
        String[] paths = { "/quiz/v1/**" };
        String description = resourceLoader.loadResourceAsString("openapi/quiz-description.md");
        
        var info = new Info()
                .title("3 - MS Quiz v1")
                .version("1.0.0")
                .description(description)

                .contact(new Contact().email(email));

        return GroupedOpenApi.builder()
                .group("3 - MS Quiz v1")
                .addOpenApiCustomizer(openApi -> openApi.info(info))
                .pathsToMatch(paths)
                .build();
    }

    @Bean
    public GroupedOpenApi infoLiveResources() {
        String[] paths = { "/live/v1/**" };
        String description = resourceLoader.loadResourceAsString("openapi/live-description.md");
        
        var info = new Info()
                .title("4 - MS Live v1")
                .version("1.0.0")
                .description(description)

                .contact(new Contact().email(email));

        return GroupedOpenApi.builder()
                .group("4 - MS Live v1")
                .addOpenApiCustomizer(openApi -> openApi.info(info))
                .pathsToMatch(paths)
                .build();
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")));
    }
}