package com.maicon.estrutura_dados.vetor.test;


import com.maicon.estrutura_dados.model.Contato;
import com.maicon.estrutura_dados.vetor.Lista;

public class Aula09 {
    public static void main(String[] args) {

        Lista<Contato> lista = new Lista<Contato>(5);

        Contato c1 = new Contato("Contato 1", "77774-45656", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "44585-78556", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "44554-66965", "contato3@email.com");

        lista.adiciona(c1);
        lista.adiciona(c2);
        lista.adiciona(c3);

        System.out.println(lista);
    }
}
