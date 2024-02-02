package ejerciciosjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SorteadorTest {
	Sorteador sorteador;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetRandomValueIntoRange() {
		int minimo = 1;
		int maximo = 10;
		int experimentos = 100;
		boolean banderaMinimo = false;
		boolean banderaMaximo = false;
		for (int i = 0; i < experimentos; i++) {
			int sorteo = sorteador.getRandomValueIntoRange(minimo, maximo);
			assertTrue(sorteo >= minimo);
			assertTrue(sorteo <= maximo);
			if (sorteo == minimo) {
				banderaMinimo = true;
			}
			if (sorteo == maximo) {
				banderaMaximo = true;
			}
		}
		assertTrue(banderaMinimo);
		assertTrue(banderaMaximo);
		minimo = -1;
		maximo = 10;
		if (sorteador.getRandomValueIntoRange(minimo, maximo) >= minimo)
			fail();
		minimo = 11;
		maximo = 10;
		if (sorteador.getRandomValueIntoRange(minimo, maximo) >= minimo)
			fail();
		minimo = 10;
		maximo = 10;
		if (sorteador.getRandomValueIntoRange(minimo, maximo) >= minimo)
			fail();
	}

}
