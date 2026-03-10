package exercise.domain;


import exercise.service.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
    private String usuarioLogin;
    private String senha;
    private String setor;
    private double taxaBonus;

    {
        taxaBonus = 0.2;
    }


    public Gerente(String nome, double salario, String usuarioLogin, String senha, String setor) {
        super(nome, salario);
        this.usuarioLogin = usuarioLogin;
        this.senha = senha;
        this.setor = setor;
    }

    @Override
    public boolean login(String usuarioDigitado, String senhaDigitada) {
        return this.usuarioLogin.equals(usuarioDigitado) && this.senha.equals(senhaDigitada);
    }

    @Override
    public double calcularBonus() {
            double bonus = salario * taxaBonus;
            return this.salario + bonus;
    }

    @Override
    public void imprimeRelatorio() {
        super.imprimeRelatorio();
        System.out.println("Setor: "+setor);
        System.out.println("Seu salario com bonus de 20%: "+calcularBonus() );
    }
}
