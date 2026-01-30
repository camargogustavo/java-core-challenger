package domain;

public class Aluno {
    private String nome;
    private int idade;
    private String gmail;
    private Curso[] cursos;


    public Aluno(String nome, int idade, String gmail) {
        this.nome = nome;
        this.idade = idade;
        this.gmail = gmail;
    }

    public Aluno(String nome, int idade, String gmail, Curso[] cursos) {
        this(nome, idade, gmail);
        this.cursos = cursos;
    }

    public void imprime() {
        System.out.println("---## Informaçoes Aluno ##---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("E-mail: " + getGmail());
        System.out.println("---## Informaçoes do Curso ##---");
        if (cursos == null) {
            System.out.println("Este aluno nao esta matriculado em nenhum curso");
            return;
        }
        for (Curso curso : cursos) {
            if (curso != null) {
                System.out.println("Nome: " + curso.getNome());
                System.out.println("Carga Horaria: " + curso.getCargaH());
                System.out.println("Responsavel: " + curso.getProfessor().getNome());

            }
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade <= 0 ){
            return;
        } else {this.idade = idade;}
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setCursos(Curso[] cursos) {
        if (cursos != null) {
            this.cursos = cursos;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getGmail() {
        return gmail;
    }

    public Curso[] getCursos() {
        return cursos;
    }
}
