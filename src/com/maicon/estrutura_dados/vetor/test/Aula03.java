package com.maicon.estrutura_dados.vetor.test;

import com.maicon.estrutura_dados.vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(8);
        vetor.adiciona("Java");
        vetor.adiciona("Angular");
        vetor.adiciona("Estrutura de Dados");
        System.out.println(vetor.tamanho());
        System.out.println(vetor);
    }
}
