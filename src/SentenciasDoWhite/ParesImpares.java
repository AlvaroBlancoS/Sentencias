package SentenciasDoWhite;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		int n = 0;
		String respuesta = " ";

		// Proceso y salida
		do {
			respuesta = "Es par";
			Scanner scan = new Scanner(System.in);
			System.out.println("Ingrese el número entero" + " ");
			n = scan.nextInt();
			System.out.println(respuesta);
		} while (n % 2 == 0);
		{
			respuesta = "Es impar";
			System.out.println(respuesta);
		}

	}

}
