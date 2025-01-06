package br.com.alura.jogo_da_forca12;

import java.util.Scanner;

public class NomeJogador12 {
    public String jogador(Scanner scanner){
        String nomeJogador = "";

        System.out.println("Digite seu nome: ");
        nomeJogador = scanner.nextLine().trim();

        while (nomeJogador.isBlank()){
            System.out.println("Digite um nome válido: ");
            nomeJogador = scanner.nextLine().trim();
        }

        String [] partes = nomeJogador.split(" ");
        StringBuilder builder = new StringBuilder();

        for(String parte : partes){
            if (parte.length() > 0){
                builder.append(parte.substring(0, 1).toUpperCase());
                builder.append(parte.substring(1).toLowerCase());
                builder.append(" ");
            }
        }
        return builder.toString().trim();
    }
}
