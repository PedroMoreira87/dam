package model;

public class Palestra {

    private String data;
    private String horario;
    private Integer instituicao;
    private Integer tema;

    public Palestra(String data, String horario, Integer instituicao, Integer tema) {
        this.data = data;
        this.horario = horario;
        this.instituicao = instituicao;
        this.tema = tema;
    }

    public Palestra() {
        data = null;
        horario = null;
        instituicao = null;
        tema = null;
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

    public Integer getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Integer instituicao) {
        this.instituicao = instituicao;
    }

    public Integer getTema() {
        return tema;
    }

    public void setTema(Integer palestrate) {
        this.tema = palestrate;
    }
}
