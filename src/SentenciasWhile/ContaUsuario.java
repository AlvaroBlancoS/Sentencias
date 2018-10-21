package SentenciasWhile;

import java.util.Scanner;

public class ContaUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int num2 = 11;
		Scanner contar = new Scanner(System.in);
		System.out.println("Escriba de 1 a 10");

		while (num < num2) {
			num = contar.nextInt();
			num++;
		}
		System.out.println("fin");
	}

}
