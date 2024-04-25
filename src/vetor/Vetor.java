package vetor;

public class Vetor {

    public String[] elementos;
    public int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        System.err.println("Não foi possível adicionar o último elemento, excede a capacidade do vertor.");
        return false;
    }

    public String buscar(int position) {
        if (!(position >=0 && position < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }
        return this.elementos[position];
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
        for(int i=0; i<elementos.length-1; i++) {
            string.append(elementos[i]);
            string.append(", ");
        }
        if (this.tamanho > 0) string.append(this.elementos[this.tamanho-1]);

        string.append("]");

        return string.toString();
    }
}
