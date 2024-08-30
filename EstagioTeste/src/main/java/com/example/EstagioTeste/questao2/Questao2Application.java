package com.example.EstagioTeste.questao2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Questao2Application {

    public static void main(String[] args) {
        SpringApplication.run(Questao2Application.class, args);

        int numero = 21; // Você pode mudar esse número para o valor que deseja testar caso queira
        boolean pertence = verificaFibonacci(numero);

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificaFibonacci(int numero) {
        int a = 0, b = 1;
        while (b <= numero) {
            if (b == numero) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        return false;
    }
}
