package vetor.test;

import vetor.Vetor;

public class Aula07 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);
        
        vetor.adiciona("Java");
        vetor.adiciona("Angular");
        vetor.adiciona("Estrutura de Dados");
        vetor.adiciona(1, "Python");
        vetor.adiciona("C#");
        vetor.adiciona("Javascript");

        System.out.println(vetor);
    }
}
