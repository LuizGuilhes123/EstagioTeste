package com.example.EstagioTeste.questao1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Questao1Application {
    public static void main(String[] args) {
        SpringApplication.run(Questao1Application.class, args);

        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("SOMA: " + SOMA);
    }
}
