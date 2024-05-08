package com.maicon.estrutura_dados.vetor.test;

import com.maicon.estrutura_dados.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);
        
        vetor.adiciona("Java");
        vetor.adiciona("Angular");
        vetor.adiciona("Estrutura de Dados");

        System.out.println(vetor);

        vetor.adiciona(1, "Python");

        System.out.println(vetor);
    }
}
