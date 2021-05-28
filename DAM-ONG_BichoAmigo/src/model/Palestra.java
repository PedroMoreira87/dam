package model;

public class Palestra {

    private String tema;
    private String data;
    private String horario;
    private Integer instituicao;
    private Integer palestrate;

    public Palestra(String tema, String data, String horario, Integer instituicao, Integer palestrate) {
        this.tema = tema;
        this.data = data;
        this.horario = horario;
        this.instituicao = instituicao;
        this.palestrate = palestrate;
    }

    public Palestra() {
        tema = null;
        data = null;
        horario = null;
        instituicao = null;
        palestrate = null;
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

    public Integer getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Integer instituicao) {
        this.instituicao = instituicao;
    }

    public Integer getPalestrate() {
        return palestrate;
    }

    public void setPalestrate(Integer palestrate) {
        this.palestrate = palestrate;
    }
}
