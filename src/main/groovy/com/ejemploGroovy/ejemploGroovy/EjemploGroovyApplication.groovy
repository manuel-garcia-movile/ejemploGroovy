package com.ejemploGroovy.ejemploGroovy


import org.springframework.boot.SpringApplication
import org.springframework.boot.*
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class EjemploGroovyApplication implements CommandLineRunner{

	@Override
	public void run(String... args) {
		System.out.println("Hello World");
	}

	static void main(String[] args) {
		SpringApplication.run EjemploGroovyApplication, args
	}
}
