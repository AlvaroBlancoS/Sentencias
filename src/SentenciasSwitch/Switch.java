package SentenciasSwitch;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 3;
		/*
		 * La variable j vamos a ejecutar con la sentencia switch que va adquirir el valor de 0 y 
		 * lo que va a ver es si ese 0 coincide con alguno de estos casos que tenemos como 
		 * case 1, case 2, etc. Y en caso que no vamos a encontrar se ejecutaría como default.
		 * Ahora imaginemos si queremos ejecutar el case 2, sin break se ejecutaría todas hasta el caso 
		 * por defecto. Por eso es importante que en cada caso se ejecute con break. 
		 */
		switch (j){
		case 5:
			System.out.println("caso 5");
		case 4:
			System.out.println("caso 4");
			break;
		case 3:
			System.out.println("caso 3");
			break;
		case 2:
			System.out.println("caso 2");
			break;
		case 1:
			System.out.println("caso 1");
		default:
			System.out.println("Caso por defecto");
			
		}
	}

}
