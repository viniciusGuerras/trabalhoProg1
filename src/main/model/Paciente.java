package main.model;

import main.enums.ClassificacaoRisco;
import main.enums.Genero;
import main.enums.Status;

import java.time.LocalDateTime;

public class Paciente extends Pessoa{
    private Historico historico;
    private LocalDateTime dataAdmissao;
    private LocalDateTime dataLiberacao;
    private Status status;
    private ClassificacaoRisco risco;

    public Paciente(String nome, Long idade, String cpf, LocalDateTime data_nascimento, Genero genero) {
        super(nome, idade, cpf, data_nascimento, genero);
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public LocalDateTime getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDateTime dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDateTime getDataLiberacao() {
        return dataLiberacao;
    }

    public void setDataLiberacao(LocalDateTime dataLiberacao) {
        this.dataLiberacao = dataLiberacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ClassificacaoRisco getRisco() {
        return risco;
    }

    public void setRisco(ClassificacaoRisco risco) {
        this.risco = risco;
    }
}
