package pilha.exercicios;

import java.util.Stack;

public class Exercicio03 {
    public static void main(String[] args) {

        imprimirPalindromo("ADA");
        imprimirPalindromo("AABBAA");
        imprimirPalindromo("AACAAGAAA");
        
    }

    public static void imprimirPalindromo(String palavra) {
        System.out.println("A palavra " + palavra + " é um palindromo? " + verificandoPalindromo(palavra));
    }

    public static boolean verificandoPalindromo(String palavra) {

        Stack<Character> pilha = new Stack<>();
        for (int i=0; i<palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        String palavraInversa = "";
        while(!pilha.isEmpty()) {
            palavraInversa += pilha.pop();
        }
        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }
        return false;
    }
}
