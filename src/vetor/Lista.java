package vetor;

public class Lista<T> {

    public T[] elementos;
    public int tamanho;

    @SuppressWarnings("unchecked")
    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
        aumentarCapacidade();
        
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        System.err.println("Não foi possível adicionar o último elemento, excede a capacidade do vertor.");
        return false;
    }

    public boolean adiciona(int posicao, T elemento) {
        this.posicaoValida(posicao);

        aumentarCapacidade();

        for (int i=(this.tamanho-1); i>=posicao; i--) {
            this.elementos[i+1] = this.elementos[i]; 
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    public void remover(int posicao) {
        this.posicaoValida(posicao);

        for (int i=posicao; i<this.tamanho-1; i++) {
            this.elementos[i] = elementos[i+1];
        }
        this.tamanho--;
    }

    public void remover(T elemento) {
        int posicao = this.buscar(elemento);
        if (posicao > -1) {
            this.remover(posicao);
        } 
    }   

    @SuppressWarnings("unchecked")
    private void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public T buscar(int posicao) {
        this.posicaoValida(posicao);

        return this.elementos[posicao];
    }

    public int buscar(T elemento) {

        // Busca Sequencial
        for (int i=0; i<this.tamanho-1; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento) {

        //Busca Sequencial
        for (int i=0; i<this.tamanho-1; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.tamanho;
    }

    private boolean posicaoValida(int posicao) {
        if (!(posicao > 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }   
        return true;
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
