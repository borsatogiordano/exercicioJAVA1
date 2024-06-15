package com.introducaopoo.exercicios1;

import java.util.Scanner;

public class Lista01 {

    Scanner scanner = new Scanner (System.in);

    public void ex1(){
        int numeroDigitado1;
			int numeroDigitado2;
			int resultado;
		
			System.out.println("Escreva um número:");

			numeroDigitado1 = scanner.nextInt();

			System.out.println("Escreva outro número:");

			numeroDigitado2 = scanner.nextInt();

			resultado = numeroDigitado1 + numeroDigitado2;

			System.out.println("A soma entre " + numeroDigitado1 + " e " + numeroDigitado2 + " é " + resultado);

			scanner.close();
    }
    public void ex2(){
        String nome;

            Scanner scanner = new Scanner (System.in);
        
			System.out.println("Digite seu nome:");
			nome = scanner.nextLine();

			System.out.println("Olá, " + nome);
			scanner.close();
    }
}
