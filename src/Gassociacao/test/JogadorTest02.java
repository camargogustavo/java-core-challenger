package Gassociacao.test;

import Gassociacao.domain.Jogador;
import Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador n1 = new Jogador("pele");
        Time time = new Time("Brazil");

        n1.setTime(time);
        n1.imprime();
    }
}
