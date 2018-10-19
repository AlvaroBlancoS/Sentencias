package SentenciasIfElse;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Entrada
		Pattern pattern = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		String email = "";
		String respuesta = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca el email:" + " ");
		email = sc.nextLine();
		Matcher mather = pattern.matcher(email);
		// Proceso y salida
		if (mather.find() == true) {
			respuesta = "El email ingresado es válido.";
		} else {
			respuesta = "El email ingresado es inválido.";
		}
		System.out.println(respuesta);
	}

}
