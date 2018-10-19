package SentenciasDoWhite;

import java.util.Scanner;

public class Digitos {

	public static void main(String[] args) {
		Scanner tecla = new Scanner (System.in);
		int numero = 4557888;
		int digitos = 1;

		// Proceso
		do {
			numero /= 10;
			digitos++;
		} while (numero > 0);
		// Salida
		System.out.println(digitos);

	}

}
