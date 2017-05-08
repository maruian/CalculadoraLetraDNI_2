package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logica.CalcularLetra;

public class CalcTest {

	@Test
	public void calculaLetraTest() {
		CalcularLetra cl = new CalcularLetra("53361469");
		assertEquals('C', cl.devolverLetra());
	}

}
