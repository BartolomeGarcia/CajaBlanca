package ejemplosAssert;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClaseUnoTest {
	ClaseUno uno;
	int numeroA, numeroB;
	int expected;
	
	@BeforeEach
	void setUp() {
		uno = new ClaseUno();
		numeroA = 6;
		numeroB = 5;
		expected=0;
	}

	@Test
	void testSumar() {
		expected = 11;
		int sumar = uno.sumar(numeroA, numeroB);
		assertEquals(expected, sumar);
	}

	@Test
	void testRestar() {
		expected=1;
		int restar = uno.restar(6, 5);
		assertEquals(expected, restar);
	}

}
