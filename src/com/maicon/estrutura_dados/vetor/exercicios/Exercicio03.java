package vetor.exercicios;

import vetor.Lista;

public class Exercicio03 {
    
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");
        lista.adiciona("D");
        lista.adiciona("E");
        System.out.println(lista);

        lista.limpar();

        System.out.println(lista);

    }
}
