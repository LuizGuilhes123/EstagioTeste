package com.example.EstagioTeste.questao5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Questao5Application {

    public static void main(String[] args) {
        SpringApplication.run(Questao5Application.class, args);

        String original = "Exemplo de string";
        String invertida = inverteString(original);

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverteString(String input) {
        char[] caracteres = input.toCharArray();
        String resultado = "";
        for (int i = caracteres.length - 1; i >= 0; i--) {
            resultado += caracteres[i];
        }
        return resultado;
    }
}
