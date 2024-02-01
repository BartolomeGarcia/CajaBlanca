package ejerciciosjunit;


public class Figuras {
	public  final float PI=3.14f;
	/**
	 * Suma los numeros introducidos por parametro
	 * @param numUno
	 * @param numDos
	 * @return la suma de los numeros
	 */
	public int sumaEnteros(int numUno,int numDos){
		return numUno+numDos;
	}
	/**
	 * Calcula el area de un circulo
	 * @param radio del circulo
	 * @return el area
	 */
	public  float areaCirculo(float radio){
		if(radio>=0)
//			return (float) (PI*radio);
		return (float) (PI*Math.pow(radio, 2));
		else
			return -1;
	}
	
	/**
	 * Calcula si un numero es par
	 * @param numero
	 * @return true si es par o false en caso contrario
	 */
	public  boolean esPar(int numero){
		if(numero%2==0)
			return true;
		else
			return false;
					
	}
	
	 long elevarNumero(int numero,int potencia){
		long resultado=1;
		for (int i = 0; i < potencia; i++) {
			resultado*=numero;
		}
		return resultado;
	}
	
}
