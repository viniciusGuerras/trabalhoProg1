package main.model;

public class Quarto {
    private Integer numeroQuartos;
    private Integer numeroLeitos;
    public Integer estadoQuarto;
    public Integer tipoQuarto;

    public Quarto(Integer numeroQuartos, Integer numeroLeitos, Integer estadoQuarto, Integer tipoQuarto) {
        this.numeroQuartos = numeroQuartos;
        this.numeroLeitos = numeroLeitos;
        this.estadoQuarto = estadoQuarto;
        this.tipoQuarto = tipoQuarto;
    }

    public Integer getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(Integer numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public Integer getNumeroLeitos() {
        return numeroLeitos;
    }

    public void setNumeroLeitos(Integer numeroLeitos) {
        this.numeroLeitos = numeroLeitos;
    }

    public Integer getEstadoQuarto() {
        return estadoQuarto;
    }

    public void setEstadoQuarto(Integer estadoQuarto) {
        this.estadoQuarto = estadoQuarto;
    }

    public Integer getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(Integer tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }
}
