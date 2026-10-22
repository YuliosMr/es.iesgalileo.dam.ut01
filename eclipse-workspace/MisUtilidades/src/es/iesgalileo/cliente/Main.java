package es.iesgalileo.cliente;

import es.iesgalileo.utilidades.Calculadora;

public class Main {

	public static void main(String[] args) {
		System.out.println("Probando libreria externa MisUtilidades");
		
		int num1 = 15;
		int num2 = 5;
		
		int suma = Calculadora.sumar(num1, num2);
		int resta = Calculadora.rest(num1, num2);
		int multiplicacion = Calculadora.multi(num1, num2);
		
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
		System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
		System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + multiplicacion);

	}

}
