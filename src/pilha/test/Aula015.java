package pilha.test;

import pilha.Pilha;

public class Aula015 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.estaVazia());
        pilha.empilha(1);
        System.out.println(pilha.estaVazia());
    }
}
