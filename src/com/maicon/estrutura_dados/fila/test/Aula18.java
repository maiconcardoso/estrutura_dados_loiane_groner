package com.maicon.estrutura_dados.fila.test;

import com.maicon.estrutura_dados.fila.Fila;

public class Aula18 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        
        System.out.println(fila.tamanho());
        System.out.println(fila.espiar());    
        
    }


}
