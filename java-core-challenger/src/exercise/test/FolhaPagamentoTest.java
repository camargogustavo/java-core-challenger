package exercise.test;

import exercise.domain.Desenvolvedor;
import exercise.domain.Funcionario;
import exercise.domain.Gerente;
import exercise.service.Autenticavel;
import exercise.service.SistemaInterno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FolhaPagamentoTest {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario gerente = new Gerente("Alana",10000 ,"admin1234", "1234", "Advogada");
        Funcionario desenvolvedor = new Desenvolvedor("Gustavo",5000 ,"admin", "1234", "Java");
        SistemaInterno verificacao = new SistemaInterno();
        Scanner input = new Scanner(System.in);
        funcionarios.add(gerente);
        funcionarios.add(desenvolvedor);

        for (Funcionario folhaPg : funcionarios){
            if (folhaPg instanceof Autenticavel a){
                System.out.println("--- Autenticação para: " + folhaPg.getNome() + " ---");
                String usuarioDigitado = input.nextLine();
                System.out.println("Digite a senha");
                String senhaDigitado = input.nextLine();
                verificacao.validarLogin(a, usuarioDigitado, senhaDigitado);
            }
        }
    }

}
