package com.scaler.practice.productservicemay25aravinth.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {

    @Bean
    public RestTemplate createRestTemplateBean(){
        return new RestTemplate();
    }
}
