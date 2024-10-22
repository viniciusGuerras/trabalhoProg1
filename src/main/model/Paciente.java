package main.model;

import main.enums.ClassificacaoRisco;
import main.enums.Genero;
import main.enums.Status;

import java.time.LocalDateTime;

public class Paciente extends Pessoa{
    private Historico historico;
    private LocalDateTime data_admissao;
    private LocalDateTime data_liberacao;
    private Status status;
    private ClassificacaoRisco risco;

    public Paciente(String nome, Long idade, String cpf, LocalDateTime data_nascimento, Genero genero) {
        super(nome, idade, cpf, data_nascimento, genero);
    }
}
