package pilha;

import base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(int capacidade) {
        super(capacidade);    
    }

    public Pilha() {
        super();
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public boolean estaVazia() {
        return super.estaVazia();
    }

    public T topo() {
        if (estaVazia()) {
            return null;
        }
        return this.elementos[this.tamanho-1];
    }

    public T desempilha() {
        return this.elementos[--tamanho];
    }
}

