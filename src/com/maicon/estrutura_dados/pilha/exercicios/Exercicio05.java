package com.maicon.estrutura_dados.pilha.exercicios;

import java.util.Stack;

public class Exercicio05 {
    public static void main(String[] args) {
        imprimirResultado(1);
        imprimirResultado(10);
        imprimirResultado(2);
        imprimirResultado(5);
    }

    public static void imprimirResultado(Integer numero) {
        System.out.println("O binário do número " + numero + " é: " + converterDecimalBinario(numero));
    }

    public static String converterDecimalBinario(Integer numero) {
        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;
        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero = numero / 2;
        }

        while (!pilha.isEmpty()) {
            numBinario += pilha.pop();
            
        }
        return numBinario;
    }
}
