package SentenciasIfElse;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		// Entrada e inicialización
		int num1 = 0;
		int num2 = 0;
		Scanner cal = new Scanner(System.in);
		System.out.println("Elige el primer número");
		num1 = cal.nextInt();
		System.out.print("Elige el segundo número");
		num2 = cal.nextInt();
		// Proceso
		int suma = num1 + num2;
		int resta = num1 - num2;
		int producto = num1 * num2;
		int division = num1 % num2;
		/*
		 * La primera salida es utilizado sin if y muestra todos los resultados de
		 * operaciones
		 */
		// Salida
		System.out.println("La suma es " + " " + suma);
		System.out.println("La resta es" + " " + resta);
		System.out.println("La multiplicación es" + " " + producto);
		System.out.println("La division es" + " " + division);

		if (num2 == 0) {
			System.out.println("Operación fallido");
		} else {
			System.out.println(num1 * num2);
		}
	}
}
