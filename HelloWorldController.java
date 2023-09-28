package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloWorld( ) {
		return "Hello World!";
	}
	
	@GetMapping("/lista")
	public String listaBSMs() {
		return "Orientação ao Futuro" + "\nResponsabilidade Pessoal" + "\nMentalidade de Crescimento" + "\nPersistência" + "\nProatividade" + "\nTrabalho em Equipe" + "\nOrientação ao Detalhes" + "\nComunicação";
	}
	@GetMapping("/objetivos")
	public String objetivosDaSemana() {
		return "\nCriar plano de carreira;" + "\nMelhorar proatividade;" + "\nEstudar conteúdo técnico da semana.";	
	}

}
