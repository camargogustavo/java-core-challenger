package DConstrutores.test;

import DConstrutores.domain.Animes;

public class AnimeTest {
    public static void main(String[] args) {
        Animes anime = new Animes("haikyu", "TV", 110, "Luta", "Production");//parenteses desse representa um construtor, construtor nao tem um retorno
        anime.Imprime();
    }
}

