package SentenciasDoWhite;

import java.util.Scanner;

public class Sumatorio {

	public static void main(String[] args) {
		// Entrada e inicialización
		int n = 0; 
		int suma = 0; 
		Scanner teclado = new Scanner(System.in);
		//Proceso
		do {
			System.out.println("Introduzca un número (0 para terminar)");
			n=teclado.nextInt();
			suma +=  n; //
		}while(n > 0 || n <0);
		
		//Salida
		System.out.println("La suma es:"+" "+suma);
		teclado.close();

	}

}
