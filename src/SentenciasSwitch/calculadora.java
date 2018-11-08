package SentenciasSwitch;

//Score
import java.util.Scanner;

/*
 * @Author Álvaro Blanco Sanginés
 * Utilizando instrucciones de tipo switch, realizar el mismo programa que el
 * ejercicio 3.b), es decir, programar una aplicación que, dada una operación
 * (+,-,*,/) realice esa operación con los dos números dados.
 */
public class calculadora {

	public static void main(String[] args) {
		// Entra e Inicialización
		Scanner tecladito = new Scanner(System.in);
		System.out.print("Por favor, elige el primer número que desees: ");
		int num1 = tecladito.nextInt();
		System.out.print(" y elige el último número que desees: ");
		int num2 = tecladito.nextInt();
		System.out.println("Ahora selecciona el operador: ");
		System.out.println("puedes elegir la suma de la opción 1 ");
		System.out.println("puedes elegir la resta de la opción 2");
		System.out.println("puedes elegir la multiplicación de la opción 3");
		System.out.println("o puedes elegir la división de la opción 4");
		int operacion = tecladito.nextInt();
		// proceso
		switch (operacion) {
		case 1:

			int suma = num1 + num2;
			// Salida
			System.out.println("La suma es:" + " " + suma);
			break;

		case 2:

			int resta = num1 - num2;
			// Salida
			System.out.println("La resta es:" + " " + resta);

			break;

		case 3:

			int producto = num1 * num2;
			// Salida
			System.out.println("La multiplicación es: " + " " + producto);

			break;

		case 4:

			if (num1 < num2) {
				// Salida
				System.out.println("Es imposile realizar el cálculo atontao!! \n");
			} else {
				int division = num1 / num2;
				// Salida
				System.out.println("La división  es:" + " " + division);
			}

			break;

		default:
			// Salida
			System.out.print("¡¡Operación fallida!!");

		}
	}

}
