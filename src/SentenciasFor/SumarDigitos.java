package SentenciasFor;

import java.util.Scanner;

public class SumarDigitos {
	/*
	 * La cadena (String cadena) le va a llegar al método sumador a través del
	 * parámetro. Por lo cual hemos llamado cadena y se comporta como una cadena
	 * variable local y esa cadena va a ser recorrida gracias a este bucle for. La
	 * cantidad de veces que queremos ejecutar, el bucle for viene determinada por
	 * la condicón de for.
	 */
	int sumador(String cadena) {
		int respuesta = 0;
		/*
		 * El for tiene dos partes; inicialización (in i=0), condición (i <
		 * cadena.length();), y actualización (i++). Este programa se trata de recorrer
		 * la cadena de caracteres que haya introducido el usuario por teclado Length
		 */
		for (int i = 0; i < cadena.length(); i++) {// Este parámetro nos indica que no sea superior a la longitud
			/*
			 * Hay dos instrucciones, uno el método charArt(), va cogiendo cada uno de los
			 * caracteres de los que consta la cadena y que también está junto string que va
			 * cogiendo el carácter que se encuentra en la posición
			 * 
			 */
			char letra = cadena.charAt(i);
			if (Character.isDigit(letra))
				/*
				 * isDigit es una cadena envoltorio de carácter y pregunta si esa letra es un
				 * dígito mediante este método. Y método letra lo que hace es evaluar como true
				 * o false si esta letra está leyendo es un dígito o no Dentro de la sentencia
				 * If hemos agregado la respuesta que se realiza a cero ir sumando el valor
				 * numérico de es dígito.
				 */
				respuesta += Character.getNumericValue(letra);
			/*
			 * geNumericValue nos permitirá de utilizar con char para que no se ejecute el
			 * código ASCII
			 */
		}
		return respuesta;
	}

	public static void main(String[] args) {
		// Entrada e inicialización
		System.out.println("Introduza uns cadena de caracteres: ");
		Scanner num = new Scanner(System.in);
		String entrada = num.nextLine();
		int suma;
		/*
		 * Hemos creado el new de la propia clase con la que estamos trabajando de
		 * SumarDigitos Así podemos evitar el trabajo con static.
		 */
		SumarDigitos programa = new SumarDigitos();

		// proceso
		/*
		 * Este proceso es una llamada al método sumador mediante el objeto programa es
		 * decir programa.sumador sería una llamada del método suma.
		 */

		suma = programa.sumador(entrada);
		// Salida
		System.out.println("La suma de los dígitos de la cadena es: " + suma);
	}
}

