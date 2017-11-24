package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.console.App;
import dev.exception.CalculException;

public class CalculService {
	
	private final Logger LOG = LoggerFactory.getLogger(App.class);

	public int additionner(String expression) {
		// TODO Ajouter un log en niveau DEBUG affichant "Evaluation de l'expression
		// <expression>".
		LOG.debug("Evaluation de l'expression" + expression);
		
		// TODO par exemple "Evaluation de l'expression 1+4"
		if(expression.isEmpty()) {
			
			throw new CalculException("Erreur, l'expression est vide");
		}
		
		String[] exp = expression.split("\\+");
		
		int res = 0;
		
		for(int i=0; i<exp.length; i++) {
			
			res += Integer.parseInt(exp[i]);
		}
		
		return res;
	}
}
