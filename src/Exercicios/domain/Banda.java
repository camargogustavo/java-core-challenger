package Exercicios.domain;

public class Banda {
    private String nome;
    private Musicos[] musicos;

    public Banda(String nome) {
        this.nome = nome;
    }

    public Banda(String nome, Musicos[] musicos) {
        this(nome);
        this.musicos = musicos;
    }
    public void imprime(){
        System.out.println("## Musicos ##");
        if(musicos != null){
            for(Musicos musico: musicos){
                if (musico != null){
                    System.out.println("Nome: "+musico.getNome());
                    System.out.println("Idade: "+musico.getIdade());
                    System.out.println("Ramo: "+musico.getRamo());
                    System.out.println("----------------");
                }
            }
        };

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null) {
            System.out.println("O Campo banda precisa de um nome");
            return;
        } else{
            this.nome = nome;}
    }

    public Musicos[] getMusicas() {
        return musicos;
    }

    public void setMusicas(Musicos[] musicas) {
        this.musicos = musicas;
    }
}
