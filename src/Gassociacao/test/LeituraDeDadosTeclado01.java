package Gassociacao.test;

import java.util.Scanner;

public class LeituraDeDadosTeclado01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = input.next();
        System.out.println("Digite sua idade abaixoo:");
        int idade =  input.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sex = input.next().charAt(0);
        System.out.println("-------------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sex);
    }
}
