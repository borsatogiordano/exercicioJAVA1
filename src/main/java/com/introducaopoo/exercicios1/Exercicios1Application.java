package com.introducaopoo.exercicios1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Exercicios1Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicios1Application.class, args);

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
