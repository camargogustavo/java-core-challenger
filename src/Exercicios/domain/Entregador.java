package Exercicios.domain;

public class Entregador {
    private String nome;
    private int idade;
    private Moto moto;

    public Entregador(String nome) {
        this.nome = nome;
    }

    public Entregador(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }
    public Entregador(String nome, int idade, Moto moto) {
        this(nome, idade);
        this.moto = moto;
    }
    public void imprime(){
        System.out.println("## ENTREGADOR ##");
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        if (this.moto != null) {
            System.out.println("## MOTOCICLETA ##");
            System.out.println("Modelo: " + this.moto.getModelo());
            System.out.println("Placa: " + this.moto.getPlaca());
            System.out.println("Ano: " + this.moto.getAno());
        } else {
            System.out.println("--- Entregador sem moto ---");
        }
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
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
}
