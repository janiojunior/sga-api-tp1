package br.unitins.topicos1.sga.model;

import jakarta.persistence.Entity;

@Entity
public class Aluno extends DefaultEntity {

    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


}
