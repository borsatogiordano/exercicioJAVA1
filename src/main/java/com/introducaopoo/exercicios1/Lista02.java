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

    public void ex6(){
        double nota1;
        double nota2;
        double media;
        double notaRec;
        double maiorNota;

        System.out.println("Insira a primeira nota:");
        nota1 = scanner.nextDouble();

        System.out.println("Insira a segunda nota:");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;
        if (media >= 6){
            System.out.println("Você está aprovado!");
        } else {
            System.out.println("Recuperação\n Insira a nota de recuperação:");
            notaRec = scanner.nextDouble();

            if (nota1 > nota2){
                maiorNota = nota1;
            } else {
                maiorNota = nota2;
            }
            if (((maiorNota + notaRec) / 2) >= 6){
                System.out.println("Você está aprovado, mas por pouco!");
            }else{
                System.out.println("Você está reprovado!");
            }
        }
    }

    public void ex7(){
        int numeroDigitado1;
        int numeroDigitado2;

        System.out.println("Insira dois números e eu idetificarei se eles são divisíveis.\nInsira o primeiro número:");
        numeroDigitado1 = scanner.nextInt();

        System.out.println("Agora Insira o divisor:");
        numeroDigitado2 = scanner.nextInt();

        if (numeroDigitado1 % numeroDigitado2 == 0){
            System.out.println(numeroDigitado1 + " é divisível por " + numeroDigitado2);
        } else {
            System.out.println(numeroDigitado1 + " não é divisível por " + numeroDigitado2);
        }
    }

    public void ex8(){

        int resposta1, resposta2, resposta3, resposta4, resposta5;
        int erros = 0;
        int acertos = 0;

        System.out.println("Qual a capital do Brasil? \n 1 - São Paulo \n 2 - Rio de Janeiro \n 3 - Brasília \n 4 - Salvador");
        resposta1 = scanner.nextInt();

        if (resposta1 != 3){
            erros++;
        } else {
            acertos++;
        }

        System.out.println("Qual o maior planeta do nosso sistema solar? \n 1 - Terra \n 2 - Júpiter \n 3 - Saturno \n 4 - Marte");
        resposta2 = scanner.nextInt();

        if (resposta2 != 2){
            erros++;
        } else {
            acertos++;
        }

        System.out.println("Quem escreveu 'Dom Quixote'? \n 1 - William Shakespeare \n 2 - Miguel de Cervantes \n 3 - Gabriel Garcia Marquez \n 4 - José Saramago");
        resposta3 = scanner.nextInt();

        if (resposta3 != 2){
            erros++;
        } else {
            acertos++;
        }
            
        if (erros == 3){
            System.out.println("Você perdeu, tente novamente.");
            System.exit(0);
        }

        System.out.println("Qual é o elemento químico representado pelo símbolo 'O'? \n 1 - Ouro \n 2 - Prata \n 3 - Oxigênio \n 4 - Hidrogênio");
        resposta4 = scanner.nextInt();

        if (resposta4 != 3){
            erros++;
        } else {
            acertos++;
        }

        if (erros == 3){
            System.out.println("Você perdeu, tente novamente.");
            System.exit(0);
        }

        System.out.println("Quantos estados tem o Brasil? \n 1 - 26 \n 2 - 25 \n 3 - 24 \n 4 - 27 ");
        resposta5 = scanner.nextInt();

        if (resposta5 != 4){
            erros++;
        } else {
            acertos++;
        }

        if (erros == 3){
            System.out.println("Você perdeu, tente novamente..\n");
            System.exit(0);
        }

        System.out.println("Você venceu, e acertou " + acertos + " questões, Parabéns!");
    }
        
}

