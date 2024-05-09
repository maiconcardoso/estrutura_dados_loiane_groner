package com.maicon.estrutura_dados.lista.test;

import com.maicon.estrutura_dados.lista.ListaEncadeada;

public class ListaEncadeadaTest {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);

        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);
    }
}
