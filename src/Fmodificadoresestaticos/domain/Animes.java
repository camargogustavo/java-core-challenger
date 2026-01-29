package Fmodificadoresestaticos.domain;

public class Animes {
    private String nome;
    private static int[] episodios;
    //0 = Bloco de inicializaçao é executado quando a JVM carregar a classe
    // 1- Aloca em memoria para o objeto\
    // 2- Cada atributo de classe é criado e inicializado com valores default ou o que for passsado. Null ou 0
    //3 Bloco de inicial;ização é executado
    //4 -  construto é executado


    static {//bloco de inicializao de instancia
        System.out.println("Dentro do bloco de inicializaçao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Animes(String nome) { this.nome = nome; }

    public Animes(){
        for (int episodios : Animes.episodios) {
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
