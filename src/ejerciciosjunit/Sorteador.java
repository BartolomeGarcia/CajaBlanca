package ejerciciosjunit;

public interface Sorteador {

	/**
	 * genera un nuemro entero aleatorio entre dos valores
	 * ambos incluidos, siempre positivos donde maximo es
	 * siempre estrictamente mayor que minimo
	 * @param minimum minimo valor posible
	 * @param maximum maximo valor posible
	 * @return un valor entre los posibles
	 */
	public int getRandomValueIntoRange(int minimum,int maximum);
}
