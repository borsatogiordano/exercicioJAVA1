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
        scanner.close();
    }

    public void ex2(){
        int numeroDigitado1;
        int numeroDigitado2;

        System.out.println("Escreva dois números e eu direi qual deles é maior.\nInsira o primeiro número:");
        numeroDigitado1 = scanner.nextInt();

        System.out.println("Agora insira outro número:");
        numeroDigitado2 = scanner.nextInt();

        if (numeroDigitado1 > numeroDigitado2){
            System.out.println(numeroDigitado1 + " é maior que " + numeroDigitado2);
        } else if (numeroDigitado1 == numeroDigitado2){
            System.out.println(numeroDigitado1 + " é igual a " + numeroDigitado2);
        } else {
            System.out.println(numeroDigitado1 + " é menor que " + numeroDigitado2);
        }
        scanner.close();
    }

    public void ex3(){
        int respostaGestante;
        int respostaPCD;
        int respostaIdoso;
        int preferencial = 0;

        while (preferencial < 1){
           
            System.out.println("Boa noite, iremos fazer umas perguntas para encaminha-lo para sua fila de atendimento.\n\n Você é gestante?\n 1 - Sim \n 2 - Não");
            respostaGestante = scanner.nextInt();
            
            if (respostaGestante == 1){
                preferencial++;
                break;
            }

            System.out.println("Você é PCD? \n 1 - Sim \n 2 - Não");
            respostaPCD = scanner.nextInt();

            if (respostaPCD == 1){
                preferencial++;
                break;
            }

            System.out.println("Você tem mais de 65 anos? \n 1 - Sim \n 2 - Não ");
            respostaIdoso = scanner.nextInt();

            if (respostaIdoso == 1){
                preferencial++;
                break;
            }

            System.out.println("Você está na fila comum!");
            System.exit(0);
        }
        System.out.println("Você está na fila preferencial!");
        scanner.close();
    }
    
    public void ex4(){
        int idade;

        System.out.println("Insira sua idade:");
        idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Você pode entrar!");
        }
        else if (idade <18 && idade >= 16){
            System.out.println("Você só pode entrar acompanhado(a) por seus responsáveis.");
        } else {
            System.out.println("Você não pode entrar.");
        }
    }
    
    public void ex5(){
        String login = "Admin";
        String loginInserido;
        int senha = 1234;
        int senhaInserida;
        boolean logado = false;

        while (!logado){
        System.out.println("Insira seu login:");
        loginInserido = scanner.nextLine();

        if (login.equals(loginInserido)){
            System.out.println("Digite sua senha:");
            senhaInserida = scanner.nextInt();
            if (senha == senhaInserida){
                System.out.println("Acesso Permitido!");
                logado = true;
            }else {
                System.out.println("Senha incorreta, tente novamente.\n\n\n\n");
            }
        } else {
            System.out.println("Login Invalido, tente novamente.\n\n\n");
        }
        }
    }
}
