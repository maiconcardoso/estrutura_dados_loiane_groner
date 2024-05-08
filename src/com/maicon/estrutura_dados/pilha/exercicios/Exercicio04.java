package com.maicon.estrutura_dados.pilha.exercicios;

import java.util.Stack;

public class Exercicio04 {
    public static void main(String[] args) {

        imprimirResultado("A + B");
        imprimirResultado("A + B + (C + D)");
        imprimirResultado("({[]})[]{}()");
        imprimirResultado("A}(A+B[");

    }

    final static String ABRE = "({[";
    final static String FECHA = ")}]";

    public static void imprimirResultado(String expressao) {
        System.out.println(expressao + " está balanceada? " + verificandoSimbolosBalanceados(expressao));
    }

    public static boolean verificandoSimbolosBalanceados(String expressao) {

        boolean balanceado = true;
        Stack<Character> pilha = new Stack<>();
        int index = 0;
        Character simbolo, topo;

        while (index < expressao.length() && balanceado) {
            simbolo = expressao.charAt(index);
            if (ABRE.indexOf(simbolo) > -1) {
                pilha.push(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (pilha.isEmpty()) {
                    return false;
                } else {
                    topo = pilha.pop();
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }
            index++;
        }

        return true;
    }
}
