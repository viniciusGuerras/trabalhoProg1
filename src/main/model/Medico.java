package main.model;

import main.enums.Genero;

import java.time.LocalDateTime;

public class Medico extends Pessoa{
    private String crm;
    private String especialidade;


    public Medico(String nome, Long idade, String cpf, LocalDateTime data_nascimento, Genero genero) {
        super(nome, idade, cpf, data_nascimento, genero);
    }
}
