package com.introducaopoo.exercicios1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Exercicios7Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicios1Application.class, args);

		//7) Escreva um programa que receba quatro notas de um aluno e calcule a média aritmética dessas notas.
		
		Scanner scanner = new Scanner (System.in);
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;

		System.out.println("Digite a primeira nota:");
		nota1 = scanner.nextDouble();

		System.out.println("Digite a segunda nota:");
		nota2 = scanner.nextDouble();

		System.out.println("Digite a terceira nota:");
		nota3 = scanner.nextDouble();

		System.out.println("Digite a quarta nota:");
		nota4 = scanner.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A média aritmética desses alunos é de: " + media);
		scanner.close();
	}
}