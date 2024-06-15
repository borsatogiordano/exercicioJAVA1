package com.introducaopoo.exercicios1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosApplication.class, args);

		Lista01 lista = new Lista01();
		lista.ex8();
	}
}
