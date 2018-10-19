package Sentencias_if;

import java.util.Scanner;

public class IFanidados {
/*
 * Realizar un programa que solicite un número entero positivo y muestre por pantalla 
 * si tiene 1, 2 ó más cifras
 * 
 * @author
 */
	public static void main(String[] args) {
		// Entrada
		Scanner in = new Scanner (System.in);
		System.out.print("Introduzca un número"+" ");
		int numero = in.nextInt();
		String respuesta = "";
		
		//Proceso
		if (numero<10) {
			respuesta = "1 cifra";
		} else if (numero<100) {
			respuesta ="Tiene 2 cifras";
		} else {
			respuesta="Tiene más de dos cifras";
		}{

		}
		
		//Salida
		System.out.println("El numero tiene"+" "+ respuesta);

	}

}
