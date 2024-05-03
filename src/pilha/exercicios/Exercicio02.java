package pilha.exercicios;

import java.util.Scanner;

import pilha.Pilha;

public class Exercicio02 {
    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner input = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.print("Entre com um número: ");
            int num = input.nextInt();

            if (num == 0) {
               if (par.estaVazia() || impar.estaVazia()) {
                System.out.println("Pilha está vazia");
               } else {
                    System.out.println("Desempilhando a pilha par: " + par.desempilha());
                    System.out.println("Desempilhando a pilha ímpar: " + impar.desempilha());
               }
            } 
            else if (num % 2 == 0) {
                System.out.println("Empilhando na pilha par: ");
                par.empilha(num);
            } else {
                System.out.println("Empilhando na pilha ímpar: ");
                impar.empilha(num);
            }
        }

        input.close();

        while (!par.estaVazia()) {
            System.out.println("Desempilhando a pilha par " + par.desempilha());
        }


        while (!impar.estaVazia()) {
            System.out.println("Desempilhando a pilha ímpar " + impar.desempilha());
        }
    }
}
