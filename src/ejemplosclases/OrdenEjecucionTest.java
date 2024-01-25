package ejemplosclases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrdenEjecucionTest {
	StringBuilder algo;

	@BeforeEach
	void beforeEach() {
		System.out.println("beforeeach");	
		algo=new StringBuilder("hola");
	}

	@Test
	void test() {
		algo.append(" que");
		System.out.println(algo);
	}

	@Test
	void test2() {
		algo.append(" tal");
		System.out.println(algo);
	}

	//pa luego
//	@AfterEach
//	void afterEach() {
//		System.out.println("aftereach");
//
//	}
}
