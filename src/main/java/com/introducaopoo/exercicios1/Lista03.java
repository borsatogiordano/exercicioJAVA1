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
}
