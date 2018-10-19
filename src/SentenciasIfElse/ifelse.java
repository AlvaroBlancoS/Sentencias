package SentenciasIfElse;

public class ifelse {

	public static void main(String[] args) {
		// Comparación de números decimales
		double numero = 2;
		double raizcuadrada = Math.sqrt(numero);
		double similar = raizcuadrada * raizcuadrada;
		// No se puede utilizar simplemente el ==
		if (numero == similar)
			System.out.println("Método erroneo son iguales");
		else 
			System.out.println("Método erroneo son diferentes");
	}
	//Lo que importa es si son muy similares
	final double EPSILON = 1e-12;
	if (Math.abs(numero - similar)<EPSILON)
		System.out.println("Método correcto son iguales");
	else
		System.out.println("Método correcto son diferentes");

}
}
