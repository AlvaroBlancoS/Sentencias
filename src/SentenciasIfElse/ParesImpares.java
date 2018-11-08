package SentenciasIfElse;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		// Entrada
		Scanner ParImpar = new Scanner(System.in);
		System.out.print("Por favor introduzca un número: ");
		int cualquierNumero = ParImpar.nextInt();
		// Proceso
		boolean Par;
		Par = cualquierNumero % 2 == 0;
		if (!Par)
			// Salida
			System.out.println("Es impar");
		else
			// Salida
			System.out.println("Es par");
		// Salida
		System.out.println("Fin");
	}
}
