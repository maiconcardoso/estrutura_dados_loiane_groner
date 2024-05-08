package com.maicon.estrutura_dados.base.fila.exercicios;

import com.maicon.estrutura_dados.base.fila.Fila;

public class Exercicio01 {

    public static void main(String[] args) {

        Fila<Documento> filaImpressora = new Fila<>();

        filaImpressora.enfileirar(new Documento("A", 4));
        filaImpressora.enfileirar(new Documento("B", 6));
        filaImpressora.enfileirar(new Documento("C", 7));
        filaImpressora.enfileirar(new Documento("D", 9));
        filaImpressora.enfileirar(new Documento("E", 10));
        filaImpressora.enfileirar(new Documento("F", 3));

        while (!filaImpressora.estaVazia()) {
            Documento doc = filaImpressora.desenfileirar();
            System.out.println("Imprimindo documento: " + doc.getNome());
            try {
                Thread.sleep(200 * doc.getNumeroFolhas());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos os documentos foram impressos.");
    }
}
