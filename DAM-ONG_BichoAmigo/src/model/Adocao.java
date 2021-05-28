package model;

public class Adocao {

    private String data;
    private String comentario;
    private Integer usuario;
    private Integer animal;

    public Adocao(String data, String comentario, Integer usuario, Integer animal) {
        this.data = data;
        this.comentario = comentario;
        this.usuario = usuario;
        this.animal = animal;
    }

    public Adocao() {
        data = null;
        comentario = null;
        usuario = null;
        animal = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Integer getAnimal() {
        return animal;
    }

    public void setAnimal(Integer animal) {
        this.animal = animal;
    }
}
