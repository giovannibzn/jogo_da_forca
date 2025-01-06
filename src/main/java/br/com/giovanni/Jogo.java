package br.com.alura.jogo_da_forca12;

import br.com.alura.jogo_da_forca10.Historico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo12 {
    public void theGame(Scanner scanner, String nomeJogador, Historico12 historico) {
        var palavra = new BancoDePalavras12();
        String palavraSecreta = palavra.palavraSecreta();
        palavraSecreta = palavraSecreta.toUpperCase();
        int pontuacao = 0;
        int tentativasRestantes = 10;

        System.out.println("""
                Bem vindo ao Jogo da Forca
                Sua pontuação será a quantidade de letras acertadas multiplicado pelas tentativas restantes
                Boa Sorte!
                """);

        char[] progresso = new char[palavraSecreta.length()];
        for (int i = 0; i < palavraSecreta.length(); i++) {
            progresso[i] = '_';
        }

        List<Character> letrasTentadas = new ArrayList<>();

        while (tentativasRestantes > 0 && new String(progresso).contains("_")) {
            System.out.printf("""
                    Palavra: %s
                    Pontuação: %d
                    Tentativas Restantes: %d
                    """, String.valueOf(progresso), pontuacao, tentativasRestantes);

            System.out.println("Digite uma letras: ");
            String entrada = scanner.nextLine().toUpperCase().trim();

            if (entrada.isBlank()) {
                System.out.println("Erro! Não pode ser vazio");
                continue;
            }

            char tentativa = entrada.charAt(0);

            if (letrasTentadas.contains(tentativa)) {
                System.out.printf("""
                        Você já tentou a letra %s
                        """, tentativa);
                continue;
            }

            letrasTentadas.add(tentativa);

            if (palavraSecreta.indexOf(tentativa) != -1) {
                for (int i = 0; i < palavraSecreta.length(); i++) {
                    if (palavraSecreta.charAt(i) == tentativa) {
                        progresso[i] = tentativa;
                        pontuacao += 10;
                    }
                }
                System.out.printf("""
                            Boa, a letra %s pertence a palavra
                            """, tentativa);
            } else {
                System.out.printf("""
                        Que pena, a letra %s não pertence a palavra
                        """, tentativa);
                pontuacao -= 5;
                tentativasRestantes--;
            }
        }
        if (tentativasRestantes == 0) {
            System.out.printf("""
                    %s você perdeu, a palavra secreta era %s
                    """, nomeJogador, palavraSecreta);
        } else {
            System.out.printf("""
                    Parabéns %s, você acertou a palavra secreta %s, com %d tentativas resntates
                    Sua pontuação foi de %d
                    """, nomeJogador, palavraSecreta, tentativasRestantes, (pontuacao * tentativasRestantes));
            historico.adicionarPartida(nomeJogador, (pontuacao * tentativasRestantes));
        }
    }
}