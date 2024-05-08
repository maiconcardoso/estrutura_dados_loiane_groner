package com.maicon.estrutura_dados.fila.exercicios;

import com.maicon.estrutura_dados.fila.Fila;
import com.maicon.estrutura_dados.fila.FilaComPrioridade;

public class Exercicio02 {

    public static void main(String[] args) {
        Fila<String> atendimentoRegular = new Fila<>();
        FilaComPrioridade<String> atendimentoPrioritario = new FilaComPrioridade<>();

        final int MAX_ATENDIMENTO = 3;

        atendimentoRegular.enfileirar("Pessoa 1");
        atendimentoPrioritario.enfileirar("Pessoa 1P");
        atendimentoRegular.enfileirar("Pessoa 2");
        atendimentoRegular.enfileirar("Pessoa 3");
        atendimentoPrioritario.enfileirar("Pessoa 2P");
        atendimentoRegular.enfileirar("Pessoa 4");
        atendimentoRegular.enfileirar("Pessoa 5");
        atendimentoPrioritario.enfileirar("Pessoa 3P");
        atendimentoRegular.enfileirar("Pessoa 6");
        atendimentoPrioritario.enfileirar("Pessoa 7P");
        atendimentoRegular.enfileirar("Pessoa 7");
        atendimentoRegular.enfileirar("Pessoa 8");
        atendimentoPrioritario.enfileirar("Pessoa 5P");
        atendimentoRegular.enfileirar("Pessoa 9");
        atendimentoPrioritario.enfileirar("Pessoa 4P");
        atendimentoPrioritario.enfileirar("Pessoa 6P");

        while(!atendimentoRegular.estaVazia() || !atendimentoPrioritario.estaVazia()) {
            int count = 0;
            while (!atendimentoPrioritario.estaVazia() && count < MAX_ATENDIMENTO) {
                atenderPessoas(atendimentoPrioritario);
                count++;
            }
            if (!atendimentoRegular.estaVazia() || atendimentoPrioritario.estaVazia()) {
                atenderPessoas(atendimentoRegular);
            }
        }
    }

    public static void atenderPessoas(Fila<String> fila) {
        String pessoasAtendidas = fila.desenfileirar();
        System.out.println(pessoasAtendidas + " atendida.");
    }
}
