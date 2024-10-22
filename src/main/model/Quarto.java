public class Quarto {
    private Integer numero_quarto;
    private Integer numero_leitos;
    public Integer EstadoQuarto;
    public Integer Tipo_Quarto;

    public Quarto(Integer EstadoQuarto, Integer Tipo_Quarto, Integer numero_leitos, Integer numero_quarto) {
        this.EstadoQuarto = EstadoQuarto;
        this.Tipo_Quarto = Tipo_Quarto;
        this.numero_leitos = numero_leitos;
        this.numero_quarto = numero_quarto;
    }

    public Integer getNumero_quarto() {
        return numero_quarto;
    }

    public Integer getNumero_leitos() {
        return numero_leitos;
    }

    public Integer getEstadoQuarto() {
        return EstadoQuarto;
    }

    public Integer getTipo_Quarto() {
        return Tipo_Quarto;
    }

    public void setNumero_quarto(Integer numero_quarto) {
        this.numero_quarto = numero_quarto;
    }

    public void setNumero_leitos(Integer numero_leitos) {
        this.numero_leitos = numero_leitos;
    }

    public void setEstadoQuarto(Integer estadoQuarto) {
        EstadoQuarto = estadoQuarto;
    }

    public void setTipo_Quarto(Integer tipo_Quarto) {
        Tipo_Quarto = tipo_Quarto;
    }

    


    
    
}
