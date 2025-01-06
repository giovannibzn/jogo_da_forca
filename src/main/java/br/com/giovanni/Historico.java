package br.com.alura.jogo_da_forca12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Historico12 {
    List<Partida12> historico = new ArrayList<>();

    public void adicionarPartida(String nomeJogador, int pontuacao){
        historico.add(new Partida12(nomeJogador, pontuacao));
    }

    public void exibirHistorico(){
        Collections.sort(historico, Comparator.comparing(Partida12::getPontuacao).reversed());
        System.out.println("Histórico de partidas: ");
        for(Partida12 partida:historico){
            System.out.println(partida);
        }
    }
}
