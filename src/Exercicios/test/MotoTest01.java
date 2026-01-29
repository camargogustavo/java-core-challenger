package Exercicios.test;

import Exercicios.domain.Entregador;
import Exercicios.domain.Moto;

public class MotoTest01 {
    public static void main(String[] args) {
        Moto moto = new Moto("Fazer","EDI6B87",2022);
        Entregador n1 = new Entregador("Gustavo", 19);
        n1.setMoto(moto);
        n1.imprime();
    }
}
