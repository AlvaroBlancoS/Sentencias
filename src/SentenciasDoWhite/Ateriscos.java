package SentenciasDoWhite;

public class Ateriscos {
	public static void main(String[] args) {
		// Entrada
		/*
		 * Tenemos una variable de int llamado asterisco y el número entero es 0 En la
		 * condición de while he puesto que el asterico quiero que cuente desde 0 hasta
		 * 5. Y en la salida hemos imprimido cinco dígitos de fila y la condición que he
		 * creado automáticamente se imprime 5 dígitos de la columna y gracias al
		 * operador unario de ++ nos han permitido que contar hasta cinco dígitos se
		 * termina porque sin él seguirá contando hasta el infinito. Si quitáramos la
		 * última de imprimir (println) en lugar de contar cinco digitos de fila y de
		 * columna, se contará 20 dígitos de columna
		 */
		int asterisco = 0;
		// Proceso y salida

		while (asterisco < 5) {

			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.println("*");
			asterisco++;

		}

	}
}
