package domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Curso[] cursos;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Curso[] cursos) {
        this(nome, especialidade);
        this.cursos = cursos;
    }

    public void imprime() {
        System.out.println("---## Informação Professor ##---");
        System.out.println("Nome: " + getNome());
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("---## Cursos matriculado ##---");
        if (cursos == null) {
            System.out.println("Este professor nao esta matriculado em nenhum curso");
            return;
        }
        for (Curso curso : cursos) {
            if (curso != null) {
                System.out.println("Nome: " + curso.getNome());
                System.out.println("Carga Horaria: " + curso.getCargaH());
            }
        }
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        }
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setCursos(Curso[] cursos) {
        if (cursos != null){
        this.cursos = cursos;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Curso[] getCursos() {
        return cursos;
    }
}
