package com.livraria.app.entities;

import java.io.Serializable;

public class Emprestimo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String data;
    private String dataDevolucao;

    public Emprestimo() {

    }

    public Emprestimo(Integer id, String data, String dataDevolucao) {
        this.id = id;
        this.data = data;
        this.dataDevolucao = dataDevolucao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emprestimo that = (Emprestimo) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
