package SentenciasIfElse;
import java.util.Scanner;

public class MayorMenor {
	public static void main(String[] args) {
		// Entrada e inicializaci�n
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba su n�mero por favor:");
		// En proceso
		float numero = teclado.nextFloat();
		// Salida
		if ((numero > 10)) {
			System.out.println("El" + " " + numero + " " + "es mayor que diez");
		} else {
			System.out.println("El" + " " + numero + " " + "es menor que diez");
		}
	}
}
