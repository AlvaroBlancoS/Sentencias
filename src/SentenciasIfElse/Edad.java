package SentenciasIfElse;

import java.util.Scanner;

public class Edad {
	public static void main(String[] args) {
		// Entrada e inicialización

		int numero = 0;
		String respuesta;
		Scanner edad = new Scanner(System.in);
		// proceso
		System.out.println("Escriba su edad:" + "" + " ");
		numero = edad.nextInt();

		// Salida
		if (numero < 18) {
			respuesta = "Eres menor de edad";
		} else {
			respuesta = "Eres mayor de edad";
		}
		System.out.println(respuesta);

	}

}
