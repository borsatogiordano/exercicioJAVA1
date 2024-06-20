package com.introducaopoo.exercicios1;
import java.util.Scanner;
public class Lista03 {

    Scanner scanner = new Scanner(System.in);

    public void ex1(){

        int segundos;

        System.out.println("Digite um número de segundos entre 1 e 59");
        segundos = scanner.nextInt();

        if (segundos >= 1 && segundos <= 59) {
        
            for (int i = 1; i <= segundos;){
                try{
                    Thread.sleep(1000);
                    System.out.println(segundos + " segundo(s)");
                    segundos--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void ex2(){
        int numero;

        System.out.println("Escreva um número e eu te direi a tabuada:");
        numero = scanner.nextInt();

        for (int i = 0; i<=10 ; i++){
            System.out.println(numero + " X " + i + " é igual: " + (numero*i));
        }
    }

    public void ex3(){
        /* Escreva um código que receba dois números inteiros e escreva todos os
        números pares entre eles.*/

        int numeroDigitado1, numeroDigitado2;

        System.out.println("Escreva um número e te direi os números pares entre eles\nPrimeiro número:");
        numeroDigitado1 = scanner.nextInt();

        System.out.println("Segundo número:");
        numeroDigitado2 = scanner.nextInt();

        System.out.println("Os números pares entre " + numeroDigitado1 + " e " + numeroDigitado2 + " são: ");

        if (numeroDigitado1 < numeroDigitado2){
            for (int i = numeroDigitado1; i <= numeroDigitado2; i++){
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        } else if (numeroDigitado1 > numeroDigitado2){
            for (int i = numeroDigitado2;i <= numeroDigitado1 ;i++){
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Os números são iguais.");
        }



    }
}
