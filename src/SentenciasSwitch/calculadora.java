package SentenciasSwitch;

//Score
import java.util.Scanner;

/*
 * @Author �lvaro Blanco Sangin�s
 * Utilizando instrucciones de tipo switch, realizar el mismo programa que el
 * ejercicio 3.b), es decir, programar una aplicaci�n que, dada una operaci�n
 * (+,-,*,/) realice esa operaci�n con los dos n�meros dados.
 */
public class calculadora {

	public static void main(String[] args) {
		// Entra e Inicializaci�n
		Scanner tecladito = new Scanner(System.in);
		System.out.print("Por favor, elige el primer n�mero que desees: ");
		int num1 = tecladito.nextInt();
		System.out.print(" y elige el �ltimo n�mero que desees: ");
		int num2 = tecladito.nextInt();
		System.out.println("Ahora selecciona el operador: ");
		System.out.println("puedes elegir la suma de la opci�n 1 ");
		System.out.println("puedes elegir la resta de la opci�n 2");
		System.out.println("puedes elegir la multiplicaci�n de la opci�n 3");
		System.out.println("o puedes elegir la divisi�n de la opci�n 4");
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
			System.out.println("La multiplicaci�n es: " + " " + producto);

			break;

		case 4:

			if (num1 < num2) {
				// Salida
				System.out.println("Es imposile realizar el c�lculo atontao!! \n");
			} else {
				int division = num1 / num2;
				// Salida
				System.out.println("La divisi�n  es:" + " " + division);
			}

			break;

		default:
			// Salida
			System.out.print("��Operaci�n fallida!!");

		}
	}

}
