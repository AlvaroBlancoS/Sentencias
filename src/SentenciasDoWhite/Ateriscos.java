package SentenciasDoWhite;

public class Ateriscos {
	public static void main(String[] args) {
		// Entrada
		/*
		 * Tenemos una variable de int llamado asterisco y el n�mero entero es 0 En la
		 * condici�n de while he puesto que el asterico quiero que cuente desde 0 hasta
		 * 5. Y en la salida hemos imprimido cinco d�gitos de fila y la condici�n que he
		 * creado autom�ticamente se imprime 5 d�gitos de la columna y gracias al
		 * operador unario de ++ nos han permitido que contar hasta cinco d�gitos se
		 * termina porque sin �l seguir� contando hasta el infinito. Si quit�ramos la
		 * �ltima de imprimir (println) en lugar de contar cinco digitos de fila y de
		 * columna, se contar� 20 d�gitos de columna
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
