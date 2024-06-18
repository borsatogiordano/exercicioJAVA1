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
		String sobrenome;

            Scanner scanner = new Scanner (System.in);
        
			System.out.println("Digite seu nome:");
			nome = scanner.nextLine();

			System.out.println("Digite seu sobrenome");
			sobrenome = scanner.nextLine();

			System.out.println("Olá, " + nome + " " + sobrenome);
			scanner.close();
    }
    public void ex3(){
        double dinheiro;
		double dinheiroConvertido;

		System.out.println("Escreva um valor em R$ e eu converterei para dólar:");
		dinheiro = scanner.nextDouble();

		dinheiroConvertido = dinheiro / 5.252252;

		System.out.println("O valor de: " + dinheiro + " R$ convertido em dólar é de: " + dinheiroConvertido + " $");

		scanner.close();
    }
    public void ex4(){

        int numeroDigitado;

		System.out.println("Escreva um número e eu te direi o sucessor e o antecessor");
		numeroDigitado = scanner.nextInt();

		System.out.println("O número antecessor de " + numeroDigitado + " é: " + (numeroDigitado-1) + ", e o sucessor é: " + (numeroDigitado+1));

		scanner.close();
    }
    public void ex5(){
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
    public void ex6(){
        double distanciaPercorrida;
		double totalGastoCombustivel;

		System.out.println("Escreva a distância que você percorreu:");
		distanciaPercorrida = scanner.nextDouble();

		System.out.println("Escreva o total de litros gastos em combustível");
		totalGastoCombustivel = scanner.nextDouble();

		System.out.println("O consumo médio desta viagem foi de: " + (distanciaPercorrida/totalGastoCombustivel) + " km/L.");
		scanner.close();
    }
    public void ex7(){
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

		System.out.println("A média aritmética desse aluno é de: " + media);
		scanner.close();
    }
    public void ex8(){
        double fahrenheit;
        double celsius;

        System.out.println("Escreva a temperatura em Celsius que você deseja converter:");
        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + "°F convertida para Celsius é:" + celsius);
        scanner.close();
    }
}
