package com.utils.services;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Utilitário para carregar conteúdo de arquivos de recursos
 */
@Component
public class ResourceLoader {

    /**
     * Carrega o conteúdo de um arquivo de recurso como String
     * 
     * @param resourcePath caminho do arquivo de recurso
     * @return conteúdo do arquivo como String
     * @throws RuntimeException se houver erro ao carregar o arquivo
     */
    public String loadResourceAsString(String resourcePath) {
        try {
            ClassPathResource resource = new ClassPathResource(resourcePath);
            try (InputStream inputStream = resource.getInputStream()) {
                return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar arquivo de recurso: " + resourcePath, e);
        }
    }
}