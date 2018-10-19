package SentenciasFor;

import java.util.Scanner;

public class SumarDigitos {
	/*
	 * La cadena (String cadena) le va a llegar al m�todo sumador a trav�s del
	 * par�metro. Por lo cual hemos llamado cadena y se comporta como una cadena
	 * variable local y esa cadena va a ser recorrida gracias a este bucle for. La
	 * cantidad de veces que queremos ejecutar, el bucle for viene determinada por
	 * la condic�n de for.
	 */
	int sumador(String cadena) {
		int respuesta = 0;
		/*
		 * El for tiene dos partes; inicializaci�n (in i=0), condici�n (i <
		 * cadena.length();), y actualizaci�n (i++). Este programa se trata de recorrer
		 * la cadena de caracteres que haya introducido el usuario por teclado Length
		 */
		for (int i = 0; i < cadena.length(); i++) {// Este par�metro nos indica que no sea superior a la longitud
			/*
			 * Hay dos instrucciones, uno el m�todo charArt(), va cogiendo cada uno de los
			 * caracteres de los que consta la cadena y que tambi�n est� junto string que va
			 * cogiendo el car�cter que se encuentra en la posici�n
			 * 
			 */
			char letra = cadena.charAt(i);
			if (Character.isDigit(letra))
				/*
				 * isDigit es una cadena envoltorio de car�cter y pregunta si esa letra es un
				 * d�gito mediante este m�todo. Y m�todo letra lo que hace es evaluar como true
				 * o false si esta letra est� leyendo es un d�gito o no Dentro de la sentencia
				 * If hemos agregado la respuesta que se realiza a cero ir sumando el valor
				 * num�rico de es d�gito.
				 */
				respuesta += Character.getNumericValue(letra);
			/*
			 * geNumericValue nos permitir� de utilizar con char para que no se ejecute el
			 * c�digo ASCII
			 */
		}
		return respuesta;
	}

	public static void main(String[] args) {
		// Entrada e inicializaci�n
		System.out.println("Introduza uns cadena de caracteres: ");
		Scanner num = new Scanner(System.in);
		String entrada = num.nextLine();
		int suma;
		/*
		 * Hemos creado el new de la propia clase con la que estamos trabajando de
		 * SumarDigitos As� podemos evitar el trabajo con static.
		 */
		SumarDigitos programa = new SumarDigitos();

		// proceso
		/*
		 * Este proceso es una llamada al m�todo sumador mediante el objeto programa es
		 * decir programa.sumador ser�a una llamada del m�todo suma.
		 */

		suma = programa.sumador(entrada);
		// Salida
		System.out.println("La suma de los d�gitos de la cadena es: " + suma);
	}
}

