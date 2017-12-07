package br.com.tec.controller.test;



import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.tec.AbstractTest;
import br.com.tec.controller.CadastrarNome;

public class CadastrarNomeTest extends AbstractTest{

	private static final Logger LOGGER = Logger.getLogger(CadastrarNomeTest.class);
	
	@Test
	public void cadastrarNome() {
		String print;
		
		CadastrarNome nome = new CadastrarNome();
		print = nome.cadastro("Eduardo");
		
		LOGGER.info("Nome cadastrado com sucesso = "+print);
		
	}
}
