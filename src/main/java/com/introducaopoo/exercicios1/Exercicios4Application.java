package com.introducaopoo.exercicios1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Exercicios4Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicios1Application.class, args);

		Scanner scanner = new Scanner (System.in);
		int numeroDigitado;

		System.out.println("Escreva um número e eu te direi o sucessor e o antecessor");
		numeroDigitado = scanner.nextInt();

		System.out.println("O número antecessor de " + numeroDigitado + " é: " + (numeroDigitado-1) + ", e o sucessor é: " + (numeroDigitado+1));

		scanner.close();
	}	
}