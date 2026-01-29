package Gassociacao.test;

import Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador n1 = new Jogador("Pele");
        Jogador n2 = new Jogador("Romario");
        Jogador n3 = new Jogador("Neymar");
        Jogador[] jogadores = {n1, n2, n3};

        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
