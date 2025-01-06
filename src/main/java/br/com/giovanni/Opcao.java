package br.com.alura.jogo_da_forca12;

import java.util.Scanner;

public class Opcao12 {
    public String opcaoEscolhida(Scanner scanner){
        System.out.println("Precione C para continuar:");
        return scanner.nextLine().trim();
    }
}
