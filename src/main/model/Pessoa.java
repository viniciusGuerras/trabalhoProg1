package main.model;

import main.enums.Genero;

import java.time.LocalDateTime;

public class Pessoa {

    private String nome;
    private Long idade;
    private String cpf;
    private LocalDateTime data_nascimento;
    private Genero genero;

    public Pessoa(String nome, Long idade, String cpf, LocalDateTime data_nascimento, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDateTime data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}