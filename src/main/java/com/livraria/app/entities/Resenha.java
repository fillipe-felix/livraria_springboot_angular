package com.livraria.app.entities;

import java.io.Serializable;
import java.util.Objects;

public class Resenha implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String texto;
    private Integer nota;

    public Resenha() {

    }

    public Resenha(Integer id, String texto, Integer nota) {
        this.id = id;
        this.texto = texto;
        this.nota = nota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resenha resenha = (Resenha) o;

        return Objects.equals(id, resenha.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
