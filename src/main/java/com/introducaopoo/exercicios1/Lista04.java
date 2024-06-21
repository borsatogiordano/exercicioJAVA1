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


    }
}
