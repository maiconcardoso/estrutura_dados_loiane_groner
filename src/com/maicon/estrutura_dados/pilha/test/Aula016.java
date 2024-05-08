package com.maicon.estrutura_dados.pilha.test;

import com.maicon.estrutura_dados.pilha.Pilha;

public class Aula016 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.topo());
        System.out.println(pilha);

        pilha.empilha(1);
        pilha.empilha(2);
        
        System.out.println(pilha.topo());
        System.out.println(pilha);
    }
}
