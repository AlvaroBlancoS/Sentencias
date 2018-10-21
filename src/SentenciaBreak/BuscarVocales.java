package SentenciaBreak;
import java.util.Scanner;

public class BuscarVocales {
/*
 * El primer método está utizando un Break
 */
	boolean tieneVocales1 (String cadena){
		boolean hayVocales = false;
		int i = 0;
		while (i < cadena.length()) {
			if ("AEIOUaeiou".contains(Character.toString(cadena.charAt(i)))){
				hayVocales = true;
				break;
			}
			i++;
		}
		return hayVocales;
	}
/*
 * En cambio el segundo método no está utilizan un break	
 */
	
	boolean tieneVocales2 (String cadena){
		boolean hayVocales = false;// Esta variable nos permitirá de devolver el método, por eso el primer método estamos usando booleana
		int i = 0;
		while (i < cadena.length() && !hayVocales) {
			if ("AEIOUaeiou".contains(Character.toString(cadena.charAt(i))))
				hayVocales = true;
			i++;
		}

		return hayVocales;
	}
	
	public static void main(String[] args) {
		//Inicialización y Entrada
		System.out.print("Introduzca una cadena de texto: ");
		Scanner sc = new Scanner (System.in);
		String texto = sc.nextLine();
		BuscarVocales programa = new BuscarVocales();//es un objeto
		
		//Proceso y Salida
		if (programa.tieneVocales1(texto)) 
			System.out.println("Método 1: Tiene vocales");
		else
			System.out.println("Método 1: No tiene vocales");
		
		if (programa.tieneVocales2(texto)) 
			System.out.println("Método 2: Tiene vocales");
		else
			System.out.println("Método 2: No tiene vocales");
	}
}
