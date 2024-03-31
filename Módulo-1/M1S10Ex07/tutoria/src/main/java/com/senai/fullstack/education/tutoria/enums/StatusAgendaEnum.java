package com.senai.fullstack.education.tutoria.enums;

public enum StatusAgendaEnum {
    AGENDADO("agendado"),
    CANCELADO("cancelado"),
    CONCLUIDO("concluído");

    private String descricao;

    StatusAgendaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
