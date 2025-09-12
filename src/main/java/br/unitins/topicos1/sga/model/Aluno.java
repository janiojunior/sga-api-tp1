package br.unitins.topicos1.sga.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Aluno extends DefaultEntity {

    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private Double peso;

    @ManyToOne
    @JoinColumn(name = "id_municipio")
    private Municipio naturalidade;

    // private Sexo sexo; MASCULINO OU FEMININO

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Municipio getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Municipio naturalidade) {
        this.naturalidade = naturalidade;
    }

    

}
