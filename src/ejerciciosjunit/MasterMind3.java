package ejerciciosjunit;

import java.util.Scanner;

public class MasterMind3 {
	private Combinacion enigma;
	/**
	 * Sortea el enigma a adivinar
	 * @return vector de 4 posiciones con n�meros entre 1 y 5 
	 */
	public void sortearEnigma() {
		enigma=new Combinacion();
	}
	/**
	 * Pide lo que va en la posicion del vector
	 * @return el vector que se va a comprobar con el sorteado
	 */
	public Combinacion pedirCombinacion() {
		return null;
		//TODO
	}
	
	/**
	 * Comprueba si el resultado obtenido es una combinacion ganadora
	 * @param resultado vector de 4 posiciones que representa el resultado de la combinacion 
	 * @return verdadero si el resultado esta relleno completamente con 7
	 */
	public boolean comprobarGanador(int[] resultado) {
		//TODO
		return false;
	}
	
	/**
	 * Comprueba si los colores coincidentes estan en la posicion correcta
	 * @param combinacion
	 * @param resultado
	 */
	public void comprobarPosicion(Combinacion combinacion, int[] resultado) {		
		//TODO
	}
	
	/**
	 * Comprueba si la ficha que has metido esta en el vector enigma
	 * @param combinacion es el vector que el jugador ha metido y quiere comprobar
	 * @return el vector resultante que pone 6 si el numero esta en el vector enigma
	 */
	public Combinacion comprobarColor( Combinacion combinacion) {
		//TODO
		return null;
	}
	
	/**
	 * Compara la combinacion del jugador con el enigma de la maquina
	 * @param combinacion
	 * @return vector de resultados donde 6 es color y 7 colr y posicion
	 */
	public int[] comprobarCombinacion( Combinacion combinacion) {
		//TODO
		return null;
	}

	public Combinacion getEnigma() {
		return enigma;
	}
	public void setEnigma(Combinacion enigma) {
		this.enigma = enigma;
	}
	
	
	
}
