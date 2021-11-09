package com.example.springcoredojo;

import com.example.springcoredojo.Entidades.Jugador;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDojoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			Jugador jugador = ctx.getBean(Jugador.class);
			System.out.println(jugador);
		};
}
	}