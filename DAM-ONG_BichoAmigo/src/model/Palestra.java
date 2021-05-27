package model;

public class Palestra {

    private String tema;
    private String data;
    private String horario;

    public Palestra(String tema, String data, String horario) {
        this.tema = tema;
        this.data = data;
        this.horario = horario;
    }

    public Palestra() {
        tema = null;
        data = null;
        horario = null;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
