package SentenciasIfElse;

public class TablasVerdad {
	public static void main(String[] args) {
		// Entrada e inicialización
		//proceso
		boolean a = 1<5;  //Nos indica si el 1 es menor que cinco 
		int b = (8+3) * 11; //no es un booleano, el booleano solo consiste en las dos opcioes(true/false)
		boolean c = true || false;// Es una tabla de or que nos indica si el verdaro o falso es verdedero
		boolean d = (true || false) || (true && false);//Nos están indicando con la tabla de AND y OR
		//boolean e = true + false;// Está mal escrito, es boolean no se utiliza los signos ni la cocatenación, sólo se utiliza verdadero o falso
		
		//Salida
		if (a) {
			System.out.println("Es menos"+" "+a);
		}
		else {	
			System.out.println("Es más"+""+a);
		}
		
		if(c) {
			System.out.println(c);
		}else {
			System.out.println(c);
		}
		
		if(d) {
			System.out.println(d);
		}else {
			System.out.println(d);
		}
	}
}
