package pilha.exercicios;

import java.util.Scanner;

import pilha.Pilha;

public class Exercicio01 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        Scanner input = new Scanner(System.in);

        for (int i=1; i<=10; i++) {
            System.out.print("Entre com um número: ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("Empilhando o numero: " + num);
                pilha.empilha(num);
            } else {
                if (pilha.estaVazia()) {
                    System.out.println("A pilha está vazia");
                } else {
                    System.out.println("Número ímpar, desempilhando o elemento da pilha: " + pilha.desempilha());
                }
            }
        }
        input.close();

        System.out.println("Desempilhando todos os elementos da pilha");
        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
        }

        System.out.println("Todos os elementos foram desempilhados.");
    }
}
