package Gassociacao.test;

import Gassociacao.domain.Ator;
import Gassociacao.domain.Filme;

public class FilmeTest01 {
    public static void main(String[] args) {
        Ator a1 = new Ator("Dwayne Johnson", "The Rock");
        Ator a2 = new Ator("Kiernan Shipka", "Gryla");
        Ator a3 = new Ator("josh HUtcherson", "Derek Danforth");
        Ator a4 = new Ator("Jason Statham", "Shaw");
        Filme f1 = new Filme("Red One", "15/11/2025");
        Filme f2 = new Filme("Beekeeper", "12/01/2024");

        Ator[] elencoBeekeeper ={a3, a4};
        Ator[] elencoRedOne = {a1,a2};
        f1.setAtores(elencoRedOne);
        f2.setAtores(elencoBeekeeper);
        Filme[] filmeDotherock = {f1};
        a1.setFilmes(filmeDotherock);
        a2.setFilmes(filmeDotherock);
        Filme[] filmesDoJason = {f2};
        a3.setFilmes(filmesDoJason);
        a4.setFilmes(filmesDoJason);
        f1.imprime();
        f2.imprime();
        a1.imprime();
        a4.imprime();


    }
}
