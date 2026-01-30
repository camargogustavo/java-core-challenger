package test;

import domain.Aluno;
import domain.Curso;
import domain.Professor;
import org.w3c.dom.ls.LSOutput;

public class Test01 {
    public static void main(String[] args) {
        Professor p1 = new Professor("André Braito","Matematica");
        Curso c1 = new Curso("Maratonando Java", "150 Horas", p1);
        Aluno a1 = new Aluno("Gustavo",19,"gg@gmail.com");
        Aluno a2 = new Aluno("Joao", 18, "jg@gmail.com");

        //Criar um array para armazenar os alunos
        //Settar os alunos no curso
        Aluno[] alunodoscursos = {a1,a2};
        c1.setAlunos(alunodoscursos);

        //Dizer para os alunos qual cursos eles fazem
        Curso[] cursodoaluno = {c1};

        a1.setCursos(cursodoaluno);
        a2.setCursos(cursodoaluno);

        //Digo para o professor quais cursos ele dará
        p1.setCursos(cursodoaluno);


        System.out.println("______Curso______");
        c1.imprime();
        System.out.println("______Aluno______");
        a1.imprime();
    }
}
