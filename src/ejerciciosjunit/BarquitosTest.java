package ejerciciosjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BarquitosTest {
	Barquitos barquitos;
	int filas;
	int columnas;
	int size;

	@BeforeEach
	void setUp() throws Exception {
		size=5;
	}

	@Test
	void testGeneraBarcoDentroLimitesCuadrado() {
		filas=10;
		columnas=10;
		int[][] barco = barquitos.generaBarco(filas, columnas, size);
	}
	@Test
	void testGeneraBarcoDentroLimitesRectangular() {
		fail("Not yet implemented");
	}
	@Test
	void testGeneraBarcoRecto() {
		fail("Not yet implemented");
	}
	@Test
	void testGeneraBarcoCasillasDiferentes() {
		fail("Not yet implemented");
	}
	@Test
	void testGeneraBarcoCasillasPropagacionCorrecta() {
		fail("Not yet implemented");
	}
	

}
