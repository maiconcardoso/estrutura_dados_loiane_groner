package vetor.test;

import vetor.Vetor;

public class Aula05 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);
        
        vetor.adiciona("Java");
        vetor.adiciona("Angular");
        vetor.adiciona("Estrutura de Dados");
        

        System.out.println(vetor.buscar("Estrutura de Dados"));
    }
}
