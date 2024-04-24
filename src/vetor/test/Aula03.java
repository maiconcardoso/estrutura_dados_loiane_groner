package vetor.test;

import vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        vetor.adiciona("Java");
        vetor.adiciona("Angular");
        vetor.adiciona("Estrutura de Dados");
        System.out.println(vetor.tamanho());
        System.out.println(vetor);
    }
}
