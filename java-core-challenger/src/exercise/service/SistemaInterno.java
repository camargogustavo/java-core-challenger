package exercise.service;

import exercise.domain.Funcionario;

public class SistemaInterno {
    public void validarLogin(Autenticavel autenticavel, String usuarioDigitado, String senhaDigitado){
        if (autenticavel.login(usuarioDigitado, senhaDigitado)){
            System.out.println("Acesso liberado ao sistema");
            if (autenticavel instanceof Funcionario){
                Funcionario f = (Funcionario) autenticavel;
                f.imprimeRelatorio();
            }
        } else {
            System.out.println("Acesso negado");
        }

    }
}
