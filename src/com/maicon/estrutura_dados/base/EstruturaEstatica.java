package com.maicon.estrutura_dados.base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    @SuppressWarnings("unchecked")
    protected EstruturaEstatica(int novaCapacidade) {
        this.elementos = (T[]) new Object[novaCapacidade];
        this.tamanho = 0;
    }

    protected EstruturaEstatica() {
        this(10);
    }

    protected boolean adiciona(T elemento) {
        aumentarCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        System.err.println("Não foi possível adicionar o último elemento, excede a capacidade do vertor.");
        return false;
    }

    protected boolean adiciona(int posicao, T elemento) {
        this.posicaoValida(posicao);

        aumentarCapacidade();

        for (int i = (this.tamanho - 1); i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    @SuppressWarnings("unchecked")
    private void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    private boolean posicaoValida(int posicao) {
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }
        return true;
    }

    public void remover(int posicao) {
        this.posicaoValida(posicao);

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = elementos[i + 1];
        }
        this.tamanho--;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            string.append(elementos[i]);
            string.append(", ");
        }
        if (this.tamanho > 0) {
            string.append(this.elementos[this.tamanho - 1]);
        }

        string.append("]");

        return string.toString();
    }
}
