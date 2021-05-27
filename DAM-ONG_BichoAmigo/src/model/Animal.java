package model;

public class Animal {

    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String detalhes;

    public Animal(String nome, String especie, String raca, int idade, String detalhes) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.detalhes = detalhes;
    }

    public Animal() {
        nome = null;
        especie = null;
        raca = null;
        idade = -1;
        detalhes = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}
