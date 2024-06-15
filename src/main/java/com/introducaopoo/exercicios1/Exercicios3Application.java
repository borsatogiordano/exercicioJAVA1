package com.introducaopoo.exercicios1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Exercicios3Application {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosApplication.class, args);

			Scanner scanner = new Scanner (System.in);

			double dinheiro;
			double dinheiroConvertido;

			System.out.println("Escreva um valor em R$ e eu converterei para dólar:");
			dinheiro = scanner.nextDouble();

			dinheiroConvertido = dinheiro / 5.252252;

			System.out.println("O valor de: " + dinheiro + " R$ convertido em dólar é de: " + dinheiroConvertido + " $");

			scanner.close();
    }
}    