package Hheranca.domain;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println("Rua: " + this.endereco.getRua() + " CEP: " + endereco.getCep());
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
