package ejerciciosjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FigurasTest {
	Figuras figuras;

	@BeforeEach
	void setUp() throws Exception {
		figuras = new Figuras();
	}

	@Test
	void testSumaEnteros() {
		int uno = 3000, otro = 1;
		int expected = 3001;
		assertEquals(expected, figuras.sumaEnteros(uno, otro));
		;
	}

	@Test
	void testAreaCirculo() {
		int radio = 1;
		// forzando el valor para que sea float
		float expected = 3.14159265f;
		float delta = .01f;
		// los valores validos son un rango entre
//		expected-delta y expected+delta
		// hay que usarlo siempre para float y double
		assertEquals(expected, figuras.areaCirculo(radio), delta);
		radio=-1;
		expected=-1f;
		assertEquals(expected, figuras.areaCirculo(radio), delta);
		radio=2;
		expected=12.56f;
		assertEquals(expected, figuras.areaCirculo(radio), delta);
		radio=-2;
		expected=-1f;
		assertEquals(expected, figuras.areaCirculo(radio), delta);
	}

	@Test
	void testEsPar() {
		int valor=1;
		assertFalse(figuras.esPar(valor)); 
		valor=2;
		assertTrue(figuras.esPar(valor)); 
		valor=0;
		assertTrue(figuras.esPar(valor)); 
		valor=-2;
		assertTrue(figuras.esPar(valor)); 
		valor=-3;
		assertFalse(figuras.esPar(valor)); 
	}

	@Test
	void testElevarNumero() {
		int valor=1,potencia=1;
		Long expected=1l;
		assertEquals(expected, figuras.elevarNumero(valor, potencia));
		valor=2;potencia=10;
		expected=0l;
		assertEquals(expected, figuras.elevarNumero(valor, potencia));
		valor=2;potencia=-2;
		expected=0L;
		assertEquals(expected, figuras.elevarNumero(valor, potencia));
		valor=16;potencia=-2;
		expected=0L;
		assertEquals(expected, figuras.elevarNumero(valor, potencia));
	}

}
