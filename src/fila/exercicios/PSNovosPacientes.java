package fila.exercicios;

import java.util.Random;

import fila.FilaComPrioridade;

public class PSNovosPacientes implements Runnable {

    private FilaComPrioridade<Pessoa> fila;
    int count = 7;
    Random prioridade = new Random();
    final int TOTAL_PACIENTES = 5;

    public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }
    

    @Override
    public void run() {
        for (int i=0; i< TOTAL_PACIENTES; i++) {
            Pessoa pessoa = new Pessoa("Pessoa " + count, prioridade.nextInt(3));
            try {
                Thread.sleep(6000);
                fila.enfileirar(pessoa);
                System.out.println("Pessoa enfileirada.");
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
