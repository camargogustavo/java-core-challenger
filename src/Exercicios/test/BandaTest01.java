package Exercicios.test;

import Exercicios.domain.Banda;
import Exercicios.domain.Musicos;

public class BandaTest01 {
    public static void main(String[] args) {
        Banda b1 = new Banda("Mobloide");
        Musicos m1 = new Musicos("Gustavo",19, "Vocalista");
        Musicos m2 = new Musicos("Alana",19, "Guitarrista");
        Musicos[] listTheSingers = {m1,m2};
        b1.setMusicas(listTheSingers);
        b1.imprime();
    }
}
