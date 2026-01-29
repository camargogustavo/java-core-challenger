package Gassociacao.domain;

public class Filme {
    private String nome;
    private String data;
    private Ator[] atores;

    public Filme(String nome) {
        this.nome = nome;
    }

    public Filme(String nome, String data) {
        this(nome);
        this.data = data;
    }

    public Filme(String nome, String data, Ator[] atores) {
        this(nome, data);
        this.atores = atores;
    }

    public void imprime() {
        System.out.println("## Filme ##");
        System.out.println("Filme: "+getNome());
        System.out.println("Data de lançamento: "+getData());
        if (getAtores() == null) {
            System.out.println("Get Atores Nulo");
            return;
        }
        System.out.println("## Atores ##");
        for (Ator atore : getAtores()) {
            System.out.println("Nome Real: " + atore.getNomeReal());
            System.out.println("Nome Artistico: " + atore.getNomeArtistico());
            System.out.println("----");
        }
        System.out.println("-----------------");
    }

    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("Campo do nome do filme vazio.");
            return;
        } else {
            this.nome = nome;
        }
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setAtores(Ator[] atores) {
        this.atores = atores;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public Ator[] getAtores() {
        return atores;
    }
}
