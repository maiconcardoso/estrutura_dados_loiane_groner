package fila;

import base.EstruturaEstatica;

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
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileirar() {
        final int POSICAO_INICIAL = 0;
        if (this.estaVazia()) {
            return null;
        }
        T elementoASerRemovido = this.elementos[POSICAO_INICIAL];
        this.remover(POSICAO_INICIAL);
        return elementoASerRemovido;
    }
}
