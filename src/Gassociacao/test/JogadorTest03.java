package Gassociacao.test;

import Gassociacao.domain.Jogador;
import Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time t1 = new Time("Brazil");
        Jogador n1 = new Jogador("Pele");
        Jogador n2 = new Jogador("Romario");

        Jogador[] jogadores = {n1,n2};

        n1.setTime(t1);
        t1.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        n1.imprime();
        System.out.println("--- Time ---");
        t1.imprime();
    }
}
