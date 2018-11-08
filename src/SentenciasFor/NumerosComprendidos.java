package SentenciasFor;

import java.util.Scanner;

public class NumerosComprendidos {
	public static void main(String[] args) {
		// counting even numbers
		Scanner obtener = new Scanner(System.in);
		int cantidadNumeros, i;

		System.out.print("");
		cantidadNumeros = obtener.nextInt();

		for (i = 1; i <= cantidadNumeros; i++) {
			System.out.println(i);
		}

	}
}
