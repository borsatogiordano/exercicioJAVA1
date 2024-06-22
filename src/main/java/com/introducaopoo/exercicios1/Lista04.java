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
}
