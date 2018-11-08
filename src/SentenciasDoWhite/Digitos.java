package SentenciasDoWhite;

import java.util.Scanner;

public class Digitos {

	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		int digitos = 0;
		int numero = 0;
		System.out.println("Escribe cantidades de dígitos que quieras");
		numero = tecla.nextInt();

		// Proceso
		do {
			numero /= 10;
			digitos++;
		} while (numero > 0);
		// Salida
		System.out.println("Son" + " " + digitos + " " + " " + "digitos");

	}

}
