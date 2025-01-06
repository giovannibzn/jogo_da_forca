package br.com.alura.jogo_da_forca12;

import java.util.Random;

public class BancoDePalavras12 {
    private static final String [] palavra = {
            "moto",
            "casa",
            "cachorro",
            "gato",
            "jacare",
            "bicicleta",
            "televisao",
            "radio",
            "telefone",
            "celular",
            "aviao",
            "panetone",
            "natal",
            "rato",
            "tubarao",
            "praia",
            "bola",
            "bala",
            "cadeira",
            "mesa",
            "parede",
            "tinta",
            "ventilador",
            "lagarto",
            "cenoura",
            "beterraba",
            "maionese",
            "alface",
            "tomate",
            "pepino",
            "batata",
            "gelatina",
            "churrasco",
            "churrasqueira",
            "cerveja",
            "refrigerante",
            "academia",
            "parque",
            "rua",
            "travesseiro",
            "toalha",
            "carregador",
            "tomada",
            "luz",
            "lua",
            "sol",
            "dia",
            "noite",
            "caminhao",
            "navio",
            "torre",
            "espuma",
            "raio",
            "chuva",
            "chuveiro",
            "cozinha",
            "abajur",
            "refrigerante",
            "relogio",
            "tubarao",
            "peixe",
            "jornal",
            "governo",
            "dinheiro"
    };

    public String palavraSecreta(){
        Random random = new Random();
        int sorteio = random.nextInt(palavra.length);
        return palavra[sorteio];
    }
}
