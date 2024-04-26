package vetor;

public class Vetor {

    public String[] elementos;
    public int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {
        aumentarCapacidade();
        
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        System.err.println("Não foi possível adicionar o último elemento, excede a capacidade do vertor.");
        return false;
    }

    public boolean adiciona(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição Inválida!");
        } 
        aumentarCapacidade();

        for (int i=(this.tamanho-1); i>=posicao; i--) {
            this.elementos[i+1] = this.elementos[i]; 
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public String buscar(int posicao) {
        if (!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }
        return this.elementos[posicao];
    }

    public int buscar(String elemento) {

        // Busca Sequencial
        for (int i=0; i<elementos.length; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        for(int i=0; i<this.tamanho-1; i++) {
            string.append(elementos[i]);
            string.append(", ");
        }
        if (this.tamanho > 0) {
            string.append(this.elementos[this.tamanho-1]);
        }

        string.append("]");
        
        return string.toString();
    }
}
