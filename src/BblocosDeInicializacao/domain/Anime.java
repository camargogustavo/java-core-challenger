package BblocosDeInicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1- Aloca em memoria para o objeto\
    // 2- Cada atributo de classe é criado e inicializado com valores default ou o que for passsado. Null ou 0
    //3 Bloco de inicial;ização é executado
    //4 -  construto é executado
    {//bloco de inicializao de instancia
        System.out.println("Dentro do bloco de inicializaçao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for (int episodios : this.episodios) {
            System.out.println(episodios + "");
        }
        System.out.println();
    }

    public String getNome(){
        return nome;
    }

    public int[] getEpisodios(){
        return episodios;
    }
}
