package exercise.domain;

import exercise.service.Autenticavel;

public class Desenvolvedor extends Funcionario implements Autenticavel {
    private String usuarioLogin;
    private String senha;
    private String linguagem;
    private double taxaBonus;
    {
        taxaBonus = 0.1;
    }

    public Desenvolvedor(String nome, double salario, String usuarioLogin, String senha, String linguagem) {
        super(nome, salario);
        this.usuarioLogin = usuarioLogin;
        this.senha = senha;
        this.linguagem = linguagem;
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
        System.out.println("Linguagem   : "+linguagem);
        System.out.println("Seu salario com bonus de 10%: "+calcularBonus() );
    }
}
