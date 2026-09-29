package ClaseProgramacion01;

import java.util.Scanner;

public class EntradaSalida {

	public static void main(String[] args) {
//		//con print se escribe en la misma linea
//		System.out.print("Hola, ");
//		System.out.println("Me llamo Pepe");
//		//
//		System.out.println("Hola, ");
//		System.out.print("me llamo Pepe");
//		// con printf imprimo formato
//		
//		int edad = 32;
//		float peso = 74.5f;
//		String nombre = "pepe";
//		
//	System.out.printf("Tengo %d años%n", edad);
//		System.out.printf("peso %.2f kg", peso);
//		System.out.printf("Me llamo %s", nombre);
//		
//		System.out.printf("Me llamo %s. tengo %d años y peso %.2f kg%n", nombre, edad, peso);
//		
//		System.out.println("===============================");
//		System.out.println("Variable   Valor");
//		System.out.println("===============================");
//		System.out.printf("Nombre %8s%n", nombre);
//		System.out.printf("Edad %8d%n", edad);
//		System.out.printf("Peso %.2f%n", peso);
		
		//recoger datos del teclado
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el numero de alumnos de 1DAM:  " );
		int matriculados1DAM = teclado.nextInt();	
		
	
		//leo numero decimal 
		System.out.print("¿Que nota media esperas que saque este grupo?: ");
		double mediaGrupo1DAM = teclado.nextDouble();
		
		// leo la primera palabra que escriba el usuario
				System.out.print("Como te llamas?: ");
				String nombreUsuario = teclado.next();
				teclado.nextLine();
		
		//leo todo el texto que me escriba el usuario
				System.out.print("Que has estudiado?: ");
				String estudiosUsuario = teclado.nextLine();
		
		//Muestra por pantalla los datos recogidos
		System.out.printf("En 1DAM hay %d alumnos matriculados.\n", matriculados1DAM);
		System.out.printf("la nota media esperada para 1DAM va a ser %.2f.\n", mediaGrupo1DAM);
		System.out.printf("Tu nombre es %s\n", nombreUsuario);
		System.out.printf("Has estudiado %s\n", estudiosUsuario);
		
		
		
		
		
		
		// Cerrar el teclado
		teclado.close();
		
		
		
		
		

	}

}
