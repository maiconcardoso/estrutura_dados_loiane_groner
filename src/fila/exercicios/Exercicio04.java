package fila.exercicios;

import java.util.Random;

import fila.Fila;

public class Exercicio04 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        final int NUMERO_CRIANCAS = 10;

        for (int i=0; i<NUMERO_CRIANCAS; i++) {
            fila.enfileirar(i);
        }

        Random aleatorio = new Random();
        int num = 0;
        while (num == 0) {
            num = aleatorio.nextInt(10);
        }

        System.out.println("Número = " + num);

        while (fila.tamanho() > 1) {
            for (int i=0; i<num; i++) {
                fila.enfileirar(fila.desenfileirar());
            }
            System.out.println("Eliminado: " + fila.desenfileirar());
        }
        System.out.println("Vencedor: " + fila.desenfileirar());
    }
}
