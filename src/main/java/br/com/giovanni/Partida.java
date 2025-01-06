package br.com.alura.jogo_da_forca12;

public class Partida12 {
    private String nomeJogador;
    private int pontuacao;

    public Partida12(String nomeJogador, int pontuacao){
        this.nomeJogador = nomeJogador;
        this.pontuacao = pontuacao;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return String.format("Jogador: %-10s | Pontuação: %d", nomeJogador, pontuacao);
    }
}
