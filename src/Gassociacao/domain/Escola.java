package Gassociacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }
    //Fazer essa sobrecarga somente quando o professor na class Escolatest01 foi declarado primeiro que a class Escola
    public Escola(String nome, Professor[] professores) {
        this(nome);
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(professores == null) return;
        for(Professor professor : professores){
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
