package exercise.domain;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();

    public void imprimeRelatorio(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Salario: "+this.salario);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
