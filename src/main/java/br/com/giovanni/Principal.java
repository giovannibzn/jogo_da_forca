package br.com.alura.jogo_da_forca12;

import java.util.Scanner;

public class Principal12 {
    public void jogoDaForca() {
        var leitor = new Scanner(System.in);
        var nome = new NomeJogador12();
        var jogo = new Jogo12();
        var historico = new Historico12();
        var opcaoEscolhida = new Opcao12();
        String opcao;

        do{
            String nomeJogador = nome.jogador(leitor);
            jogo.theGame(leitor, nomeJogador, historico);
            opcao = opcaoEscolhida.opcaoEscolhida(leitor);
        } while (opcao.equalsIgnoreCase("c"));

        historico.exibirHistorico();

        leitor.close();
    }
}
