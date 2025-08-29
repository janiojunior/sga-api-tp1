package br.unitins.topicos1.sga.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Aluno extends PanacheEntity {

    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


}
