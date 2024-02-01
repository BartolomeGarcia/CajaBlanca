package ejemplosclases;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		//assert es una afirmacion
		assertEquals(cafetera.capacidadMaxima, cafetera.cantidadActual);
		//comprobar el fallo es una negacion
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
		assertEquals(taza1,capacidad);
		if (taza1 != capacidad) {
			System.err.println("no coincide");
		}
		assertEquals(taza2,restante);
		if (taza2 != restante) {
			System.err.println("no coincide");
		}
	}

	@Test
	void testVaciarCafetera() {
		cafetera.cantidadActual= cantidad;
		cafetera.vaciarCafetera();
		int vacio = 0;
		assertEquals(cafetera.cantidadActual,vacio);
		if(cafetera.cantidadActual!=vacio) {
			System.err.println("no coincide");
		}
	}

	@Test
	void testAgregarCafe() {
		//desde vacio la llena parcialmente
		cafetera.agregarCafe(cantidad);
		assertEquals(cafetera.cantidadActual, cantidad);
		if(cafetera.cantidadActual!=cantidad) {
			System.err.println("no coincide");
		}
		//desde la cantida x intento superar la cantidad maxima
		int rebose = 3000;
		cafetera.agregarCafe(rebose);
		assertEquals(cafetera.cantidadActual, cafetera.capacidadMaxima);
		if(cafetera.cantidadActual!=cafetera.capacidadMaxima) {
			System.err.println("no coincide");
		}
	}

}
