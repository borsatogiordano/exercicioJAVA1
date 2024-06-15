package com.introducaopoo.exercicios1;

import java.util.Scanner;

public class Lista01 {

    public void ex1(){
        int numeroDigitado1;
			int numeroDigitado2;
			int resultado;
			Scanner scanner = new Scanner(System.in);
		
		
			System.out.println("Escreva um número:");

			numeroDigitado1 = scanner.nextInt();

			System.out.println("Escreva outro número:");

			numeroDigitado2 = scanner.nextInt();

			resultado = numeroDigitado1 + numeroDigitado2;

			System.out.println("O resultado entre " + numeroDigitado1 + " e " + numeroDigitado2 + " é " + resultado);

			scanner.close();
    }
}
