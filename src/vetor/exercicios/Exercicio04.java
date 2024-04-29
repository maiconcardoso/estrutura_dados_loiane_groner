package vetor.exercicios;

import model.Contato;
import vetor.Lista;

public class Exercicio04 {
    
    public static void main(String[] args) {
        int contatosCriados = 30;
        Lista<Contato> listaContatos = new Lista<Contato>(20);
        Contato contato = new Contato();
        
        for (int i=0; i<contatosCriados; i++) {
            listaContatos.adiciona(new Contato("Contato " + i, "8888-234" + i, "contato"+i+"@email.com"));
        }
        
               

    }
}
