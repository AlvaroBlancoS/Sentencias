package SentenciaBreak;

import java.util.Scanner;

public class TodasVocales {
	
	boolean losvocales (String cadena) {
		
		boolean tieneVocales2 = true; 
		int i = 0;
		while(i< cadena.length()) {
			if(!"AEIOUaeiou".contains(Character.toString(cadena.charAt(i)))) {
				tieneVocales2 = false;
			}
			i++;
		}
		return tieneVocales2;
	}
	boolean tieneVocales2 (String cadena) {
		return cadena.matches("a{3}");
	}

	public static void main(String[] args) {
		//Inicialización y Entrada
		System.out.print("Introduzca una cadena de texto: ");
		Scanner sc = new Scanner (System.in);
		String texto = sc.nextLine();
		BuscarVocales programa = new BuscarVocales();//es un objeto
		
		//Proceso y Salida
		if (programa.losvocales(texto)) 
			System.out.println("Tiene tres aes");
		else
			System.out.println("No tiene tres aes");
	}

}
