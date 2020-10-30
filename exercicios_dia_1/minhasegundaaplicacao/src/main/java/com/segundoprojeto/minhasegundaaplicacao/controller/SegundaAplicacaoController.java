package com.segundoprojeto.minhasegundaaplicacao.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/aplicacao2")
public class SegundaAplicacaoController {
	@GetMapping 
	public String aplicacao2() {
		return "Meus objetivos de aprendizagem dessa semana são: \n\nFuncionamento de API's; \nSpring Boot; \nLista de comandos do MySQL; \nAbstração na construção de tabelas para um Banco de Dados;"; 
	}

}
