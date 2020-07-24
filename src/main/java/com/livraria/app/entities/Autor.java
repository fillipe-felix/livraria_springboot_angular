package com.livraria.app.entities;

import java.io.Serializable;
import java.util.Objects;

public class Autor implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    public Autor() {

    }

    public Autor(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;

        return Objects.equals(id, autor.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
