package Exercicios.domain;

public class Moto {
    private String modelo;
    private String placa;
    private int ano;

    public Moto(String modelo){
        this.modelo = modelo;
    }
    public Moto(String modelo, String placa){
        this(modelo);
        this.placa = placa;
    }
    public Moto(String modelo, String placa, int ano){
        this(modelo, placa);
        this.ano = ano;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        if(modelo == null){
            System.out.println("Modelo da moto nao foi setadado");
            return;
        }
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
