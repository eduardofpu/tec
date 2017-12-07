package br.com.tec.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cadastro")
public class CadastrarNome {
	@RequestMapping(value = "/nome" , method = RequestMethod.GET)
	public String cadastro(@RequestParam("nome") String nome) {
		return nome;
	}

}
