package com.maicon.estrutura_dados.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;
    private final int NAO_ENCONTRADO = -1;
    private final String NAO_EXISTE = "Posição não existe.";

    public void adicionar(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionarInicio(T elemento) {
        if (this.tamanho == 0) {
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            No<T> novoNo = new No<>(elemento, this.inicio);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public void adicionar(int posicao, T elemento) {
        if (posicao > 0 || posicao < this.tamanho) {
            throw new IllegalArgumentException("Posição inválida.");
        } 
        if (this.tamanho == 0) {
            this.adicionarInicio(elemento);
        } else if (posicao == this.tamanho) {
            this.adicionar(elemento);
        } else {
            No<T> noAnterior = this.buscarPorPosicao(posicao);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento, proximoNo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    public T removerInicio() {
        if (this.tamanho == 0) {
            throw new RuntimeException("Lista está vazia.");
        }
        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;
        if (this.tamanho == 0) {
            this.ultimo = null;
        }
        return removido;
    }

    public T removerFinal() {
        if (this.tamanho == 0) {
            throw new RuntimeException("Lista está vazia.");
        }
        if (this.tamanho == 1) {
            return this.removerInicio();
        }
        No<T> penultimoNo = this.buscarPorPosicao(this.tamanho - 2);
        T removido = penultimoNo.getProximo().getElemento();
        penultimoNo.setProximo(null);
        this.ultimo = penultimoNo;
        this.tamanho--;

        return removido;
    }

    public T remover(int posicao) {
        if (this.posicaoNaoExiste(posicao)) throw new IllegalArgumentException(NAO_EXISTE);
        if (posicao == 0) this.removerInicio();
        if (posicao == this.tamanho -1) this.removerFinal();
        
        No<T> noAnterior = this.buscarPorPosicao(posicao);
        No<T> atual = noAnterior.getProximo();
        No<T> proximo = atual.getProximo();
        noAnterior.setProximo(proximo);
        atual.setProximo(null);
        this.tamanho--;
        return null;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public boolean posicaoNaoExiste(int posicao) {
        return (!(posicao > 0 || this.tamanho <= -1 ));
    }

    public No<T> buscarPorPosicao(int posicao) {
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição não existe.");
        }
        No<T> noAtual = this.inicio;
        for(int i=0; i<posicao; i++) {
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }

    public T buscar(int posicao) {
        return this.buscarPorPosicao(posicao).getElemento();
    }

    public int buscar(T elemento) {

        No<T> noAtual = this.inicio;

        int pos = 0;
        while(noAtual != null) {
            if(noAtual.getElemento().equals(elemento)){
                return pos;
            }
            pos++;
            noAtual = noAtual.getProximo();
        }

        return NAO_ENCONTRADO;
    }

    public void limpar() {
        for (No<T> atual=this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        No<T> atual = this.inicio;
        for (int i=0; i<this.tamanho -1; i++) {
            builder.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");
        return builder.toString();
    }
    
}
