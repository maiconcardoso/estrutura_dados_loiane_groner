package com.maicon.estrutura_dados.vetor.exercicios;

import java.util.Scanner;

import com.maicon.estrutura_dados.model.Contato;
import com.maicon.estrutura_dados.vetor.Lista;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Lista<Contato> listaContatos = new Lista<Contato>();

        gerarListaContatosDinamicamente(5, listaContatos);

        int opcao = 1;
        while (opcao != 0) {
            opcao = obterOpcaoMenu(input);

            switch (opcao) {
                case 1:
                    adicionarContatoFinal(input, listaContatos);
                    break;
                case 2:
                    adicionarContatoPosicao(input, listaContatos);
                    break;
                case 3:
                    obtemPosicaoContato(input, listaContatos);
                    break;
                case 4:
                    obtemContato(input, listaContatos);
                    break;
                case 5:
                    obtemPosicaoUltimoContato(input, listaContatos);
                    break;
                case 6:
                    removerContato(input, listaContatos);
                    break;
                case 7:
                    excluirListaContatos(input, listaContatos);
                    break;
                case 8:
                    imprimirListaContatos(listaContatos);
                    break;
                default:
                    break;
            }
        }
        System.out.println("O usuário digitou 0, programa terminado.");

    }

    private static void adicionarContatoFinal(Scanner input, Lista<Contato> lista) {

        System.out.println("Criando um contato, entre com as informações.");
        String nome = lerInformacao("Entre com o nome", input);
        String telefone = lerInformacao("Entre com o número de telefone", input);
        String email = lerInformacao("Entre com o E-mail", input);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("\nContato adicionado com sucesso!");
        System.out.println(contato + "\n");
    }

    private static void adicionarContatoPosicao(Scanner input, Lista<Contato> lista) {

        System.out.println("Criando um contato, entre com as informações.");
        String nome = lerInformacao("Entre com o nome", input);
        String telefone = lerInformacao("Entre com o número de telefone", input);
        String email = lerInformacao("Entre com o E-mail", input);

        Contato contato = new Contato(nome, telefone, email);

        int posicao = lerInformacaoInt("Entre com o posicao para adicionar contato", input);

        try {
            lista.adiciona(posicao, contato);

            System.out.println("\nContato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("posição Inválida, tente novamente.\n");
        }
    }

    private static void obtemPosicaoContato(Scanner input, Lista<Contato> lista) {

        int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada.", input);

        try {
            Contato contato = lista.buscar(posicao);
            System.out.println("\nO contato existe, segue os dados:");
            System.out.println(contato + "\n");
        } catch (Exception e) {
            System.out.println("Posição inválida, tente novamente.");
        }
    }

    private static void obtemPosicaoUltimoContato(Scanner input, Lista<Contato> lista) {

        int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada.", input);

        try {
            Contato contato = lista.buscar(posicao);

            System.out.println("\nFazendo pesquisa do contato encontrado.");
            posicao = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na ultima posição " + posicao);

        } catch (Exception e) {
            System.out.println("Posição inválida, tente novamente.");
        }
    }

    private static void obtemContato(Scanner input, Lista<Contato> lista) {
        int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada.", input);

        try {
            Contato contato = lista.buscar(posicao);

            System.out.println("\nFazendo pesquisa do contato encontrado.");
            posicao = lista.buscar(contato);
            System.out.println("Contato encontrado na posicao " + posicao);

            System.out.println(contato + "\n");
        } catch (Exception e) {
            System.out.println("Posição inválida, tente novamente.");
        }
    }

    private static void removerContato(Scanner input, Lista<Contato> lista) {
        int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada.", input);
        System.out.println("Deseja realmente excluir este contato? Sim ou Não");
        String msg = input.nextLine();
        if (msg.equalsIgnoreCase("Sim")) {
            lista.remover(posicao);
            System.out.println("Contato removido com sucesso!\n");
        }
    }

    private static String lerInformacao(String msg, Scanner input) {
        System.out.println(msg);
        String entrada = input.nextLine();
        return entrada;
    }

    private static int lerInformacaoInt(String msg, Scanner input) {
        int num = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = input.nextLine();
                num = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente.\n");
            }
        }
        return num;
    }

    private static void imprimirListaContatos(Lista<Contato> lista) {
        System.out.println("------------ LISTA DE CONTATOS -------------");

        System.out.println(lista.toString());
        System.out.println();
    }

    private static void excluirListaContatos(Scanner input, Lista<Contato> lista) {
        String msg = lerInformacao("Tem certeza que deseja excluir todos os contatos? Sim ou Não: ", input);
        if (msg.equalsIgnoreCase("sim")) {
            lista.limpar();
            System.out.println("Contatos foram removidos com sucesso!\n");
        }
    }

    private static void gerarListaContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        Contato contato;
        for (int i = 0; i < quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);
        }

    }

    private static int obterOpcaoMenu(Scanner input) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {
            System.out.println("Digite uma opção desejada: ");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição específica");
            System.out.println("3: Obtém contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Remover Contato");
            System.out.println("7: Excluir todos os contatos do vetor");
            System.out.println("8: Imprime lista de contatos");
            System.out.println("0: Sair\n");

            try {
                entrada = input.nextLine();
                opcao = Integer.parseInt(entrada);
                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente\n\n");
            }
        }
        return opcao;
    }
}
