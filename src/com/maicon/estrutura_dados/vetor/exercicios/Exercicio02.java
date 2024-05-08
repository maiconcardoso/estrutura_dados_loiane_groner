package com.maicon.estrutura_dados.vetor.exercicios;

import com.maicon.estrutura_dados.vetor.Lista;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");
        lista.adiciona("D");
        lista.adiciona("E");
        System.out.println("Ultimo Indice do valor A: " + lista.ultimoIndice("A") );

    }
}
