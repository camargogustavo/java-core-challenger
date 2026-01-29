package Gassociacao.domain;

public class Ator {
    private String nomeReal;
    private String nomeArtistico;
    private Filme[] filmes;

    public Ator(String nomeReal) {
        this.nomeReal = nomeReal;
    }


    public Ator(String nomeReal, String nomeArtistico) {
        this(nomeReal);
        this.nomeArtistico = nomeArtistico;
    }


    public Ator(String nomeReal, String nomeArtistico, Filme[] filmes) {
        this(nomeReal, nomeArtistico);
        this.filmes = filmes;
    }

    public void imprime() {
        System.out.println("## Ator ##");
        System.out.println("Nome Real: " + getNomeReal());
        System.out.println("Nome Artistico: " + getNomeArtistico());
        if (getFilmes() == null) {
            System.out.println("Get Filmes Null");
            return;
        }
        System.out.println("## Filmes ##");
        for (Filme filme : getFilmes()) {
            System.out.println("Filme: "+filme.getNome());
            System.out.println("Data de lançamento: "+filme.getData());
            System.out.println("----");

        }
        System.out.println("-----------------");
    }


    public void setNomeReal(String nomeReal) {
        if (nomeReal != null) {
            System.out.println("Campo Nome nulo, insira seu nome.");
            return;
        } else {
            this.nomeReal = nomeReal;
        }
    }

    public void setNomeArtistico(String nomeArtistico) {
        if (nomeArtistico == null) {
            System.out.println("Campo Nome Artistico nulo, insira seu nome.");
            return;
        } else {
            this.nomeArtistico = nomeArtistico;
        }
    }

    public void setFilmes(Filme[] filmes) {
        this.filmes = filmes;
    }

    public String getNomeReal() {
        return nomeReal;
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public Filme[] getFilmes() {
        return filmes;
    }
}
