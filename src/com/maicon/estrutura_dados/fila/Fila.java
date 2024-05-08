package com.maicon.estrutura_dados.fila;

import com.maicon.estrutura_dados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileirar(T elemento) {
        super.adiciona(elemento);
    }

    public T espiar() {
        if (super.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileirar() {
        final int POSICAO_INICIAL = 0;
        if (super.estaVazia()) {
            return null;
        }
        T elementoASerRemovido = this.elementos[POSICAO_INICIAL];
        this.remover(POSICAO_INICIAL);
        return elementoASerRemovido;
    }
}
