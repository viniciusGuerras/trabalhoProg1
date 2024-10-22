package main.model;

import java.time.LocalDateTime;
import java.util.Map;

public class Historico{
    private Map<Doenca, LocalDateTime> doencas;

    public Historico(Map<Doenca, LocalDateTime> doencas) {
        this.doencas = doencas;
    }

    public Map<Doenca, LocalDateTime> getDoencas() {
        return doencas;
    }

    public void addDoencas(LocalDateTime data, Doenca doenca){
        doencas.put(doenca, data);
    }
}