package model;

public class Tema {

    String titulo;
    Integer palestrante;

    public Tema(String titulo, int palestrante) {
        this.titulo = titulo;
        this.palestrante = palestrante;
    }

    public Tema() {
        titulo = null;
        palestrante = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Integer palestrante) {
        this.palestrante = palestrante;
    }
}
