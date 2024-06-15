package com.introducaopoo.exercicios1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Exercicios6Application {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosApplication.class, args);

		//Construa um algoritmo que leia 
		//1- a distância percorrida por um veículo em km 
		//2- o total gasto em combustível em litros. No final deverá ser respondido o consumo médio deste veículo em km/l.

		Scanner scanner = new Scanner (System.in);
		double distanciaPercorrida;
		double totalGastoCombustivel;

		System.out.println("Escreva a distância que você percorreu:");
		distanciaPercorrida = scanner.nextDouble();

		System.out.println("Escreva o total de gasto de combustível");
		totalGastoCombustivel = scanner.nextDouble();

		System.out.println("O consumo médio desta viagem foi de: " + (distanciaPercorrida/totalGastoCombustivel) + " km/L.");
		scanner.close();	
	}
}		
