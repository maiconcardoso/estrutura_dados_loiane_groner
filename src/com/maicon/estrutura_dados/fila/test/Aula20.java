package com.maicon.estrutura_dados.fila.test;

import java.util.LinkedList;
import java.util.Queue;

public class Aula20 {
    public static void main(String[] args) {
        
    Queue<Integer> fila = new LinkedList<>();

    fila.add(1);
    fila.add(2);
    fila.add(3);

    System.out.println(fila.peek());
    System.out.println(fila.isEmpty());
    System.out.println(fila.element());
    System.out.println(fila.remove());
    System.out.println(fila);
    }
}
