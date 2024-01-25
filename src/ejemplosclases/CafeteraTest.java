package ejemplosclases;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CafeteraTest {
	Cafetera cafetera;
	short cantidad;
	
	@BeforeEach
	void beforeEach() {
		cafetera = new Cafetera();
		cantidad=50;
	}

	@Test
	void testLlenarCafetera() {
		cafetera.llenarCafetera();
		if (cafetera.capacidadMaxima != cafetera.cantidadActual) {
			System.out.println("esta mal");
		}
	}

	@Test
	void testServirTaza() {
		cafetera.cantidadActual = cantidad;
		int capacidad = 30;
		int restante = cafetera.cantidadActual - capacidad;
		int taza1 = cafetera.servirTaza(capacidad);
		int taza2 = cafetera.servirTaza(capacidad);
		if (taza1 != capacidad) {
			System.err.println("no coincide");
		}
		if (taza2 != restante) {
			System.err.println("no coincide");
		}
	}

	@Test
	void testVaciarCafetera() {
		cafetera.cantidadActual= cantidad;
		cafetera.vaciarCafetera();
		int vacio = 0;
		if(cafetera.cantidadActual!=vacio) {
			System.err.println("no coincide");
		}
	}

	@Test
	void testAgregarCafe() {
		//desde vacio la llena parcialmente
		cafetera.agregarCafe(cantidad);
		if(cafetera.cantidadActual!=cantidad) {
			System.err.println("no coincide");
		}
		//desde la cantida x intento superar la cantidad maxima
		int rebose = 1000;
		cafetera.agregarCafe(rebose);
		if(cafetera.cantidadActual!=cafetera.capacidadMaxima) {
			System.err.println("no coincide");
		}
	}

}
