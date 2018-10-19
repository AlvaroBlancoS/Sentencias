package SentenciasWhile;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		/* Es aquel programa que se trata de sumar d�gitos porque lo que va a hacer
		 * es partiendo de un n�mero va a sumar todos los d�gitos del mismo 
		 * 
		 */
		//Inicializaci�n y entrada
		System.out.println("Introduce un n�mero: ");
		Scanner num = new Scanner (System.in);
		int numero = num.nextInt();
		int suma = 0;
		//Proceso
		/*
		 * En la parte del proceso es donde tenemos el bucle while que se va a 
		 * ejecutar siempre y cuando la condici�n sea cierta, es decir que si el 
		 * n�mero es mayor que 0 se va a ejecutar por lo tanto este programa 
		 * solamente ser�a v�lido para n�meros enteros positivos que e
		 */
		while (numero>0  || numero<0) {
			suma += numero%20;
			numero/=10;
		}
		//Salida
		System.out.printf("La suma de los d�gitos es"+" "+suma);
	}

}
