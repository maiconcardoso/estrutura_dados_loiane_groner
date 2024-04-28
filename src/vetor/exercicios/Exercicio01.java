package vetor.exercicios;

import vetor.Lista;

public class Exercicio01 {
    
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);

        boolean valor = lista.contem("D");

        if (valor) {
            System.out.println("A lista contem o valor D");
        }
    }
}
