package com.example.aula2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MinhaConfiguracao {

    @Bean(name = "nomeAplicacao")
    public String nomeAplicacao(){
        return "Aula 2 - Teste";
    }

    @Bean(name = "versaoAplicacao")
    public String versaoAplicacao(){
        return "versão 1.0.0";
    }
}
