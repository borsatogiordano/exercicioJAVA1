package com.introducaopoo.exercicios1;
import java.util.Scanner;
import java.util.Random;

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

    public void ex4(){
        /*Jogo da adivinhação. Peça para alguém escolher um número. Depois peça
        para outra pessoa tentar adivinhar. O programa deverá retornar dicas como:
        "Muito baixo, muito alto ou quase lá" ou "tá quente, tá frio". */

        Random random = new Random();

        int numeroAleatorio = random.nextInt(10);
        int numeroPalpite;
        boolean acertou = false;
        int diferenca;

        while (!acertou){
            System.out.println("Advinhe o número que estou pensando de 1 a 10: ");
            numeroPalpite = scanner.nextInt();

            diferenca = Math.abs(numeroAleatorio - numeroPalpite);

            if (numeroAleatorio == numeroPalpite){
                System.out.println("Parabéns, você acertou!");
            }

            else if (numeroAleatorio - numeroPalpite == 1){
                System.out.println("Ta quente!!!");
            }
            else if (numeroAleatorio - numeroPalpite <= 3){
                System.out.println("Ta morno!");
            }
            else if (numeroAleatorio - numeroPalpite <= 10){
                System.out.println("Tá frio...");
            }
            else {
                System.out.println("O número secreto está entre 1 e 10.");
            }
        }
    }

    public void ex5(){
        /*5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
        algum deles estiver errado o programa deve retornar ao usuário quais das
        opções está errada, se é o login ou a senha. O programa deve bloquear o
        acesso após 3 tentativas erradas. Quando for a última tentativa ele deve emitir
        um alerta: "Última tentativa, mais um erro seu acesso será bloqueado!" */

        String loginCheck = "Admin";
        String tryLogin;
        String passwordCheck = "1234";
        String tryPassword;
        boolean logado = false;
        int tentativas = 3;

        System.out.println("Insira suas credenciais com cautela, com 3 tentativas erradas iremos bloquear seu acesso!");
        
        while(!logado && tentativas >0){
            System.out.println("Insira seu login:");
            tryLogin = scanner.nextLine();

            if (loginCheck.equals(tryLogin)){

                System.out.println("Insira sua senha:");
                tryPassword = scanner.nextLine();

                if (passwordCheck.equals(tryPassword)){
                    System.out.println("Bem-vindo!");
                    logado = true;  
                }
                else {
                    System.out.println("Senha incorreta\n\n");
                    tentativas--;
                }
            }
            else {
                System.out.println("Login Incorreto\n\n");
                tentativas--;
            }

            if (tentativas == 1){
                System.out.println("Última tentativa!");
            }  
            if (tentativas == 0){
                System.out.println("Acesso Bloqueado.");
            }   
        }
    }

    public void ex6(){
        /* Escreva um programa que seja capaz de desenhar uma pirâmide de
        asteriscos. O usuário deverá informar quantos andares ele deseja que a
        pirâmide tenha. */

        System.out.print("Digite o número de andares da pirâmide: ");
        int andares = scanner.nextInt();

        // Desenha a pirâmide de asteriscos
        for (int i = 1; i <= andares; i++) {

            for (int j = 0; j < andares - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    
}
