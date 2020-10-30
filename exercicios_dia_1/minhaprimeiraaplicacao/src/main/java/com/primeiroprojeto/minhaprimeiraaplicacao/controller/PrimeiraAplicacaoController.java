package com.primeiroprojeto.minhaprimeiraaplicacao.controller;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/aplicacao")
public class PrimeiraAplicacaoController {

		@GetMapping 
		public String aplicacao() {
			return "Habilidades: \nOrientação aos Detalhes \nPersistência \n\nMentalidades: \nMentalidade de Crescimento \nOrientação ao futuro"; 
		}
}
