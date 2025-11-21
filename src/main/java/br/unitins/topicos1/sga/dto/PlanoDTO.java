package br.unitins.topicos1.sga.dto;

public record PlanoDTO(
    String nome,
    Integer maxAlunos,
    Integer maxProfessores,
    Double precoMensal,
    Double descontoAnual
) { }