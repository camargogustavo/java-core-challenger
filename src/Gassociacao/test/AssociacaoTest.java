package Gassociacao.test;

import Gassociacao.domain.Aluno;
import Gassociacao.domain.Local;
import Gassociacao.domain.Professor;
import Gassociacao.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Odete Abreu dos Santos");
        Aluno aluno = new Aluno("Gustavo", 19);
        Professor professor = new Professor("Alana", "advogada");
        Aluno[] alunosParticipacao = {aluno};

        Seminario seminario = new Seminario("Onde achar java", alunosParticipacao, local);

        Seminario[] seminarioDisponivel = {seminario};

        professor.setSeminarios(seminarioDisponivel);

        professor.imprimi();

    }
}
