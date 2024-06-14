package com.introducaopoo.exercicios1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Exercicios5Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicios1Application.class, args);

		Scanner scanner = new Scanner (System.in);
		double largura;
		double comprimento;
		double valorM2 = 1739.26;
		double metrosQuadrados;
		double valorTotalM2;

		System.out.println("Escreva a largura do terreno:");
		largura = scanner.nextDouble();

		System.out.println("Escreva o comprimento do terreno");
		comprimento = scanner.nextDouble();

		metrosQuadrados = largura * comprimento;

		valorTotalM2 = metrosQuadrados * valorM2;

		System.out.println("O valor total do terreno é de:" +valorTotalM2);
		scanner.close();
    }
}