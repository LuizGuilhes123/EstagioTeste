package com.example.EstagioTeste.questao3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.Arrays;

@SpringBootApplication
public class Questao3Application {

    public static void main(String[] args) {
        SpringApplication.run(Questao3Application.class, args);

        try {
            // Acessar o arquivo do classpath
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = Questao3Application.class.getResourceAsStream("/faturamento.json");

            if (inputStream == null) {
                throw new RuntimeException("Arquivo faturamento.json não encontrado no classpath");
            }

            double[] faturamentoDiario = mapper.readValue(inputStream, double[].class);

            double menorValor = Arrays.stream(faturamentoDiario).min().orElse(0);
            double maiorValor = Arrays.stream(faturamentoDiario).max().orElse(0);
            double mediaMensal = Arrays.stream(faturamentoDiario).average().orElse(0);

            long diasAcimaDaMedia = Arrays.stream(faturamentoDiario).filter(f -> f > mediaMensal).count();

            System.out.println("Menor valor de faturamento: " + menorValor);
            System.out.println("Maior valor de faturamento: " + maiorValor);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
