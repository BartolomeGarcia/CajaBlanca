package ejerciciosjunit;

public interface Barquitos {

	/***
	 * Genera un barco aleatorio dentro de los limites del tablero
	 * 
	 * @param filas    cantidad de filas del tablero
	 * @param columnas cantidad de columnas del tablero
	 * @param size     tamano del barco
	 * @return una matriz con las posiciones del barco
	 */
	public int[][] generaBarco(int filas, int columnas, int size);
}
