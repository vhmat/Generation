package com.example.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidadesMentalidades")
public class HalloController {
	
	@GetMapping
	public String habilidadeMentalidade() {
		return "   Comunicação! A habilidade de comunicação está ajudando bastante em meu desenvolvimento pessoal. "
				+ "Trabalho em equipe. Da mesma forma como a habilidade de comunicação está me ajudando no desenvolvimento pessoal, o trabalho em equipe me ajuda "
				+ "	muito meu desenvolvimento profissional, fazendo com que eu consiga me adaptar a diferentes cenários futuros. "
				+ "Persistência! A mentalidade de persistência está presente em todos os momentos do meu aprendizano no bootcamp. Com essa mentalidade, estou conseguindo "
				+ "superar minhas constantes tentativas de auto sabotagem. :) "
				+ "Crescimento! A mentalidade de crescimento está me ajudando muito entender que eu sou capaz de superar minhas dificuldades com relação à informática "
				+ "e estou vendo que posso chegar longe!! "
				+ "Em resumo, essas foram as habilidades e mentalidades que mais me ajudaram a compreender um pouco do que é o SpringBoot!!";
	}
}
