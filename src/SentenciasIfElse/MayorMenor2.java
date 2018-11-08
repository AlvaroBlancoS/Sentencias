package SentenciasIfElse;

import java.util.Scanner;

public class MayorMenor2 {
	public static void main(String[] args) {
		// Entrada e inicialización
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, escriba un número:");
		// En proceso
		float numero1 = teclado.nextFloat();
		// Salida
		if ((numero1 > 2)) {
			System.out.println("El" + " " + numero1 + " " + "es mayor que" + " " + numero1);
		} else {
			System.out.println("El" + " " + numero1 + " " + "es menor que" + " " + numero1);
			if ((numero1 > 3)) {
				System.out.println("El" + " " + numero1 + " " + "es mayor que 3");
			} else {
				System.out.println("El" + " " + numero1 + " " + "es menor que 3");
				if ((numero1 > 4)) {
					System.out.println("El" + " " + numero1 + " " + "es mayor que 4");
				} else {
					System.out.println("El" + " " + numero1 + " " + "es menor que 4");
					if ((numero1 > 5)) {
						System.out.println("El" + " " + numero1 + " " + "es mayor que 5");
					} else {
						System.out.println("El" + " " + numero1 + " " + "es menor que 5");
						if ((numero1 > 6)) {
							System.out.println("El" + " " + numero1 + " " + "es mayor que 6");
						} else {
							System.out.println("El" + " " + numero1 + " " + "es menor que 6");
						}
					}
				}
			}
		}
	}
}
