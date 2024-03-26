package com.forecasto.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ForecatoConfig {

    @Value("${rapidApi.host}")
    private String host;

    @Value("${rapidApi.key}")
    private String key;

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    @Bean
    public HttpHeaders headers() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidApi-host", host);
        headers.set("x-rapidApi-key", key);
        return headers;
    }
}
