package br.newtonpaiva.dominio;

import java.util.LinkedList;
import java.util.List;

public abstract class Pessoa {

    private String nome;
    private List<Conta> contas = new LinkedList<>();

    public abstract void validarDocumento();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
