package com.maicon.estrutura_dados.fila.test;

import com.maicon.estrutura_dados.fila.FilaComPrioridade;

public class Aula21 {

    public static void main(String[] args) {
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
        fila.enfileirar(5);
        fila.enfileirar(2);
        fila.enfileirar(4);
        fila.enfileirar(3);
        fila.enfileirar(7);

        System.out.println(fila);
    
    }
}
