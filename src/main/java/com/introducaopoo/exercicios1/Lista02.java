package com.introducaopoo.exercicios1;

import java.util.Scanner;

public class Lista02 {
    
    Scanner scanner = new Scanner (System.in);
    public void ex1(){


        int numeroDigitado;

        System.out.println("Insira um número e eu direi se o numero é ímpar ou par ou zero.");
        numeroDigitado = scanner.nextInt();

        if (numeroDigitado % 2 == 0 && numeroDigitado != 0) {
            System.out.println(numeroDigitado + " é um número par ");
        }
        else if(numeroDigitado % 2 != 0){
            System.out.println(numeroDigitado + " é um número ímpar");
        }
        else{
            System.out.println(numeroDigitado + " é 0");
        }
    }

}
