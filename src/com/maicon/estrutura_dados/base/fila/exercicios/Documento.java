package com.maicon.estrutura_dados.base.fila.exercicios;

public class Documento {

    private String nome;
    private Integer numeroFolhas;

    public Documento(String nome, Integer numeroFolhas) {
        this.nome = nome;
        this.numeroFolhas = numeroFolhas;
    }

    public Documento() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroFolhas() {
        return numeroFolhas;
    }

    public void setNumeroFolhas(Integer numeroFolhas) {
        this.numeroFolhas = numeroFolhas;
    }

    @Override
    public String toString() {
        return "Documento [nome=" + nome + ", numeroFolhas=" + numeroFolhas + "]";
    }
}
