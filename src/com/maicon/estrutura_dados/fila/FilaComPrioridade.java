package com.maicon.estrutura_dados.fila;

public class FilaComPrioridade<T> extends Fila<T>{

    public void enfileirar(T elemento) {

        @SuppressWarnings("unchecked")
        Comparable<T> chave = (Comparable<T>) elemento;

        int i;
        for (i=0; i<this.tamanho; i++) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        this.adiciona(i, elemento);
    }


}
