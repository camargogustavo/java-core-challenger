package Fmodificadoresestaticos.test;

import Fmodificadoresestaticos.domain.Carro;

public class TestCarro01 {

    public static void main(String[] args) {

        Carro.setVelocidadeLimite(180);

        Carro carro = new Carro("BMW ", 280);
        Carro carro2 = new Carro("Mercedes ", 275);
        Carro carro3 = new Carro("Audi ", 295);

        carro.imprime();
        carro2.imprime();
        carro3.imprime();
    }


}
