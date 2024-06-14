package com.introducaopoo.exercicios1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Exercicios2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicios1Application.class, args);

			Scanner scanner = new Scanner(System.in);
			String nome;

			System.out.println("Digite seu nome:");
			nome = scanner.nextLine();

			System.out.println("Olá, " + nome);
			scanner.close();
    }
}