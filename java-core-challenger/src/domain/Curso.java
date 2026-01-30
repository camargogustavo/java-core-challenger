package domain;

public class Curso {
    private String nome;
    private String cargaH;
    private Professor professor;
    private Aluno[] alunos;

    public Curso(String nome, String cargaH, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.cargaH = cargaH;
    }

    public Curso(String nome, String cargaH, Professor professor, Aluno[] alunos) {
        this(nome, cargaH, professor);
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("---## Cursos ##---");
        System.out.println("Nome: " + getNome());
        System.out.println("Carg Horaria: " + getCargaH());
        System.out.println("Professor responsavel: " + professor.getNome());
        System.out.println("---## Alunos Matriculados ##---");
        if (alunos == null) {
            System.out.println("A lista de alunos matriculados esta nula");
            return;
        }
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println(aluno.getNome());
            }
        }
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public void setCargaH(String cargaH) {
        this.cargaH = cargaH;
    }

    public void setProfessor(Professor professor) {
        if (professor != null) {
            this.professor = professor;
        }
    }

    public void setAlunos(Aluno[] alunos) {
        if (alunos != null) {
            this.alunos = alunos;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCargaH() {
        return cargaH;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
}

