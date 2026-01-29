package Gassociacao.domain;

public class Aluno {
    private int idade;
    private String nome;
    private Seminario seminarios;

    public Aluno(String nome){
        this.nome = nome;
    }
    public Aluno(String nome, int idade){
        this(nome);
        this.idade = idade;
    }
    public Aluno(String nome, int idade, Seminario seminarios){
        this(nome, idade);
        this.seminarios = seminarios;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSeminarios(Seminario seminarios) {
        this.seminarios = seminarios;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public Seminario getSeminarios() {
        return seminarios;
    }
}
