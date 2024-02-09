package ejerciciosjunit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BarquitosTest {
	Barquitos barquitos;
	int filasTablero;
	int columnasTablero;
	int size;
	int dimensiones = 2;

	@BeforeEach
	void setUp() throws Exception {
		size = 5;
		filasTablero = 10;
		columnasTablero = 10;
	}

	@Test
	void testGeneraBarcoDentroLimitesCuadrado() {
		int[][] barco = barquitos.generaBarco(filasTablero, columnasTablero, size);
		for (int i = 0; i < barco.length; i++) {
			for (int j = 0; j < barco[i].length; j++) {
				assertTrue(barco[i][j] < columnasTablero && barco[i][j] >= 0);
			}
		}

	}

	@Test
	void testGeneraBarcoDentroLimitesRectangular() {
		columnasTablero = 12;
		int limites[] = { filasTablero, columnasTablero };
//		int[][] barco = barquitos.generaBarco(filasTablero, columnasTablero, size);
		int[][] barco = { { 0, 1 }, { 1, 1 }, { 2, 1 }, { 3, 1 }, { 4, 1 } };
		for (int i = 0; i < barco.length; i++) {
			for (int j = 0; j < barco[i].length; j++) {
				assertTrue(barco[i][j] < limites[j] && barco[i][j] >= 0);
			}
		}
		for (int i = 0; i < barco.length; i++) {
			assertTrue(barco[i][0] < filasTablero && barco[i][0] >= 0);
			assertTrue(barco[i][1] < columnasTablero && barco[i][1] >= 0);
		}
	}

	@Test
	void testGeneraBarcoRecto() {
		int[][] barco = { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 0, 3 }, { 0, 4 } };
		boolean recto[] = { true, true };
		for (int i = 0; i < dimensiones; i++) {
			recto[i] = true;
			for (int j = 0; j < size - 1; j++) {
				if (barco[j][i] != barco[j + 1][i]) {
					recto[i] = false;
				}
			}
		}
		assertTrue(recto[0] ^ recto[1]);
		boolean rectoCero = true;
		rectoCero = true;
		for (int j = 0; j < size - 1; j++) {
			if (barco[j][0] != barco[j + 1][0]) {
				rectoCero = false;
			}
		}
		boolean rectoUno = true;
		rectoUno = true;
		for (int j = 0; j < size - 1; j++) {
			if (barco[j][1] != barco[j + 1][1]) {
				rectoUno = false;
			}
		}
		assertTrue(rectoCero ^ rectoUno);
	}

	@Test
	void testGeneraBarcoCasillasDiferentes() {
		int[][] barco = { { 0, 1 }, { 1, 1 }, { 2, 1 }, { 3, 1 }, { 4, 1 } };
		for (int i = 0; i < barco.length - 1; i++) {
			for (int j = i + 1; j < barco[i].length; j++) {
				assertTrue(
						barco[i][0] == barco[j][0] 
							^ barco[i][1] == barco[j][1]);
			}
		}
	}

	@Test
	void testGeneraBarcoCasillasPropagacionCorrecta() {
		fail("Not yet implemented");
	}

}
