package ClaseProgramacion01;

public class Operadores {
	public static void main(String[] args) {
		//Division
		double media = (7 + 8) / 2;
		System.out.printf("Resultado: %.2f\n", media);
		//Division double
		double mediaDouble = (7 + 8.0) / 2;
		System.out.printf("Resultado: %.2f\n", mediaDouble);
		//Division double (Divisor)
		double mediaDoubleDivisor = (7 + 8) / 2.0;
		System.out.printf("Resultado: %.2f\n", mediaDoubleDivisor);
		//Division double (Casting divisor)
		double mediaDoubleDivisorCasting = (7 + 8) / (double)2;
		System.out.printf("Resultado: %.2f\n", mediaDoubleDivisorCasting);
		
		
		//Jerarquia de operadores
//		double peso;
//		peso = 43 - 56 / 25.5 * 2 + 13;
		
//		boolean peso;
//		peso = !true && 25 >= 43 - 56 / 25.5 * 2 + 13;
//		System.out.printf("Resultado: %.2f\n", peso);
		
		// Pre y post incrementos
		int edad = 10;
		int edad2, edad3;
		//valor original
		System.out.printf("edad inicialmente vale... %d\n", edad);
		
		//postincremento
		edad2 = 25 + edad++;
		System.out.printf("Resultado postincremento: %d\n", edad2);
		System.out.printf("y edad vale... %d\n", edad);
		//preincremento
		edad3 = 25 + ++edad;
		System.out.printf("Resultado preincremento: %d\n", edad3);
		System.out.printf("y edad vale... %d\n", edad);
	}

}
