package com.introducaopoo.exercicios1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Exercicios8Application {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosApplication.class, args);

        //8) Suponha que voce trabalhe em um laboratório e seu
        //colega mediu a temperatura de um objeto em Fahrenheit.
        //Escreva um programa capaz de converter em Celsius.

        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        System.out.println("Escreva a temperatura em Celsius que você deseja converter:");
        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + "°F convertida para Celsius é:" + celsius);
        scanner.close();
    }
}
