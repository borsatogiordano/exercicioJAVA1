package com.introducaopoo.exercicios1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ExerciciosApplication {

	public class LimpaTerminal {
		static void limpa_windows() {
			try {
				if (System.getProperty("os.name").contains("Windows")) {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} else {
					System.out.println("Este comando só funciona no Windows.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosApplication.class, args);

		Lista01 lista = new Lista01();

		Lista02 lista2 = new Lista02();

		Lista03 lista3 = new Lista03();

		LimpaTerminal.limpa_windows();
		lista3.ex2();
	}
}



