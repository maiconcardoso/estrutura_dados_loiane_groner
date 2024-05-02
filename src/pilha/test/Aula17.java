package pilha.test;

import pilha.Pilha;

public class Aula17 {
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);
        pilha.empilha(5);
        pilha.empilha(6);
        pilha.empilha(7);

        System.out.println(pilha);

        System.out.println("Desempilhando o valor: " + pilha.desempilha());

        System.out.println(pilha);
    }
}
