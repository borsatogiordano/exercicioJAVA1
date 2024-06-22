package com.introducaopoo.exercicios1;

import java.util.Scanner;

public class Lista04 {

    Scanner scanner = new Scanner(System.in);

    void ex1() {
        /*
         * 1) Voce é gerente de um supermercado e sabe que os valores das
         * vendas do dia são gravados em um vetor. Digite um código que faça o
         * fechamento (soma) de vendas do dia de maneira automatizada.
         */

        double vendas[] = { 20.50, 100.50, 15.50, 10.50 };
        double fechamento = 0;

        for (double i : vendas) {
            fechamento += i;
        }

        System.out.println("O fechamento do dia foi: " + fechamento);
    }

    void ex2() {
        /*
         * Agora que voce sabe o fechamento do dia, monte um código que
         * identifique a compra de menor valor e a compra de maior valor
         */

        double vendas[] = { 20.50, 100.50, 15.50, 10.50 };
        double menorVenda = vendas[0];
        double maiorVenda = vendas[0];

        for (double i : vendas) {
            if (i < menorVenda) {
                menorVenda = i;
            }
        }

        for (double x : vendas) {
            if (x > maiorVenda) {
                maiorVenda = x;
            }
        }

        System.out.println("A menor venda foi: " + menorVenda);
        System.out.println("e a maior venda foi: " + maiorVenda);

    }

    void ex3() {
        /*
         * Ainda utilizando o exercício do mercado, calcule o ticket médio de
         * vendas do dia
         */

        double vendas[] = { 20.50, 100.50, 15.50, 10.50 };
        double fechamento = 0;
        double ticketMedio;

        for (double i : vendas) {
            fechamento += i;
        }

        ticketMedio = fechamento / vendas.length;

        System.out.println("O ticket médio foi de: " + ticketMedio);
    }

    void ex4() {
        /*
         * Escreva um código que irá percorrer uma lista de números inteiros
         * lista[ ] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 } e irá contar a quantidade de
         * números pares presente nela.
         */

        int lista[] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };

        for (int i : lista) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    void ex5() {
        /*
         * Escreva um programa que sirva como uma lista de compras de
         * mercado. Você irá criar um menu que pergunte se o usuário quer inserir
         * um item ou ver a lista.
         */

        String listaDeCompras[] = new String[100];
        int escolhaMenu;
        String item;
        boolean menu = true;
        int contador = 0;

        while (menu) {

            System.out.println("""
                    ===== Menu =====
                     1 = Add item na lista de compras.
                     2 = Ver lista de compras
                     3 = Sair
                    """);

            escolhaMenu = scanner.nextInt();

            if (escolhaMenu == 1) {
                if (contador < 100) {
                    System.out.println("Insira o item que deseja adicionar:");

                    item = scanner.next();

                    listaDeCompras[contador] = item;
                    contador++;
                    System.out.println("\n\n");
                } else {
                    System.out.println("A lista está cheia");
                }
            }

            else if (escolhaMenu == 2) {

                if (contador != 0) {
                    System.out.println("\n\n===== Lista de Compras =====");

                    for (int i = 0; i < contador; i++) {
                        System.out.println(contador + 1 + " - " + listaDeCompras[i]);
                    }
                } else {
                    System.out.println("\n\nLista de compras vazia");
                }
                System.out.println("\n\n");
            }

            else if (escolhaMenu == 3) {
                System.out.println("Saindo...");
                menu = false;
            }

            else {
                System.out.println("Digite um número válido! \n\n\n");
            }

        }
    }

    void ex6() {
        /*
         * Aproveite a questão anterior e adiciona a opção do usuário remover
         * um item.
         */
        String listaDeCompras[] = new String[100];
        int escolhaMenu;
        String item;
        boolean menu = true;
        int contador = 0;
        int removerItem;

        while (menu) {

            System.out.println("""
                    ===== Menu =====
                     1 = Add item na lista de compras.
                     2 = Ver lista de compras
                     3 = Remover item
                     4 = Sair
                    """);

            escolhaMenu = scanner.nextInt();

            if (escolhaMenu == 1) {
                if (contador < 100) {
                    System.out.println("Insira o item que deseja adicionar:");

                    item = scanner.next();

                    listaDeCompras[contador] = item;
                    contador++;
                    System.out.println("\n\n");
                } else {
                    System.out.println("A lista está cheia");
                }
            }

            else if (escolhaMenu == 2) {

                if (contador != 0) {
                    System.out.println("\n\n===== Lista de Compras =====");

                    for (int i = 0; i < contador; i++) {
                        System.out.println(i + 1 + " - " + listaDeCompras[i]);
                    }
                } else {
                    System.out.println("\n\nLista de compras vazia");
                }
                System.out.println("\n\n");
            }

            else if (escolhaMenu == 3) {

                if (contador == 0) {
                    System.out.println("Nenhum item adicionado na lista\n\n");
                } else {

                    System.out.println("\n\n===== Lista de Compras =====");

                    for (int i = 0; i < contador; i++) {
                        System.out.println(i + 1 + " - " + listaDeCompras[i]);
                    }
                    System.out.println("Digite o número do item para remover: ");
                    removerItem = scanner.nextInt();

                    listaDeCompras[removerItem - 1] = null;
                }
            }

            else if (escolhaMenu == 4) {
                System.out.println("Saindo...");
                menu = false;
            }

            else {
                System.out.println("Digite um número válido! \n\n\n");
            }
        }
    }

}
