package dev.service;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.*;

import dev.exception.CalculException;

public class CalculServiceTest {

	private static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);

	@Test
	public void testAdditionnerOK() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService");
		// TODO
		CalculService calculService = new CalculService();

		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4");
		// TODO
		int somme = 0;

		somme = calculService.additionner("1+3+4");

		LOG.info("Alors j'obtiens le résultat 8");
		// TODO
		Assert.assertEquals(8, somme);
	}

	@Test(expected = CalculException.class)
	public void testAdditionnerKO() throws CalculException {

		LOG.info("Etant donné, une instance de la classe CalculService");
		// TODO
		CalculService calculService = new CalculService();

		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4");
		// TODO
		int somme = calculService.additionner("");;

		LOG.info("Alors j'obtiens le résultat 8");
		// TODO
		Assert.assertEquals(8, somme);

	}

	@Test
	public void testAdditionnerAssertj() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService");
		// TODO
		CalculService calculService = new CalculService();
		
		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4");
		// TODO
		int somme = calculService.additionner("");;
		
		LOG.info("Alors j'obtiens le résultat 8");
		assertThat(somme).isEqualTo(8);
	}
}
