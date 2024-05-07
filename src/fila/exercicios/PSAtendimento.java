package fila.exercicios;

import fila.FilaComPrioridade;

public class PSAtendimento implements Runnable{

    FilaComPrioridade<Pessoa> fila;

    public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        while(!fila.estaVazia()) {
            try {
                System.out.println(fila.desenfileirar() + " atendida.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Atendimento concluído.");
    }

}
