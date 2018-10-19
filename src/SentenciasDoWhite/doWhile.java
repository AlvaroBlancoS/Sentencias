package SentenciasDoWhite;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// Inicialización
		Scanner num = new Scanner (System.in);
		int numero;
		/*
		 *Es un programa de comprobar entrada y no es azaroso
		 *esta selección porque el bucle de while es utilizar mucho en 
		 *estos entornos, es decir, se le pide al usuario que introduzca 
		 *el número en unas determinadas condiciones y si esas condiciones 
		 * no son las indicadas le obligamos a repetir su selección en este caso
		 * por ejemplo le vamos a obligar al usuario que introduzca un número
		 * del 1 al 100 y repetir la pregunta en caso de que el usuario no haya
		 * introducido un número en el rango solicitado
		 */
		//Entrada y proceso
		/* Dentro del proceso tenemos dos bucles (do-while) que son estas dos 
		 * instrucciones solamente primero el System.out donde le pedimos al 
		 * usuario que introduzca un número del 1 al 100 y la segunda instrucción
		 * la propia lectura de ese numero entero. (numero = num.nextInt();)
		 * Lo que haremos con la instrucción de while es finar las condiciones 
		 * por las que no se puede cumplir el que esté dentro del rango solicitado
		 * es decir que si el número es menor que 1 o es mayor que 100 debería 
		 * de repetir la pregunta y claro está que el bucle while no lo puede hacer, 
		 * lo primero que necesitamos haber leido el dato introducido por el usuario para 
		 * si tenemos que repetir o no la pregunta
		 */
		do {
			System.out.println("Introduzca un número del 1 al 100:"+" ");
			numero = num.nextInt();
		}while (numero<1 || numero>100 || numero%2 !=0);
		
		//salida y finalización
		System.out.println("El número seleccionado es: "+ numero);
		num.close();
	}

}
