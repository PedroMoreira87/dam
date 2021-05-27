package model;

public class Adocao {

    private String data;
    private String comentario;

    public Adocao(String data, String comentario) {
        this.data = data;
        this.comentario = comentario;
    }

    public Adocao() {
        data = null;
        comentario = null;
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
}
