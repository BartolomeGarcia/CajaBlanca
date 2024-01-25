package ejemplosAssert;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClaseDosTest {
	ClaseDos dos;

	@BeforeEach
	void setUp() throws Exception {
		dos=new ClaseDos();
	}

	@Test
	void testEsCierto() {
		assertTrue(dos.esCierto());
	}

	@Test
	void testEsFalso() {
		assertFalse(dos.esFalso());
		assertTrue(!dos.esFalso());
		}

}
