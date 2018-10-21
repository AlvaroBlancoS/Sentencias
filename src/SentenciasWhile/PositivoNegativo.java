package SentenciasWhile;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		// Entrada e inicializacion
		int num1 = 0;
		int num2 = 10;
		String respuesta = "";
		Scanner ns = new Scanner(System.in);
		System.out.println("Escriba un número que quieras");
		num1 = ns.nextInt();
		while(num1 < num2){
			num1++;
		if (num1 < 0) {
			respuesta = "Es negativo";
		}else if( num1 >0){
			respuesta = "Es positivo";
		}
		}
		System.out.println(respuesta);

	}

}
