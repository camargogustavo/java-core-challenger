package Hheranca.domain;

public class Funcinario extends Pessoa{
    private double salario;
    //SUPEr eu me refiro ao objeto que esta chamando
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
