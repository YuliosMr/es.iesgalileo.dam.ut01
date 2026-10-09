package es.iesgalileo.dam.ut02;

import java.util.Scanner;

public class Saludo {
	
	public static void main(String[] args) {
		
		Scanner entradaNombre = new Scanner(System.in);
		System.out.print("¿Como te llamas? ");
		String nombre = entradaNombre.nextLine();
		
		System.out.printf("Hola, %s%n", nombre);
		System.out.println("Hola, " + nombre);
		
		entradaNombre.close();
	}

}
