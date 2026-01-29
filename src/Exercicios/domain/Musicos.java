package Exercicios.domain;

public class Musicos {
    private String nome;
    private int idade;
    private String ramo;

    public Musicos(String nome) {
        this.nome = nome;
    }

    public Musicos(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }

    public Musicos(String nome, int idade, String ramo) {
        this(nome,idade);
        this.ramo = ramo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }
}
