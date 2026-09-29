package Codigo;

public class Ejercicio02_01 {
	public static void main (String[] args) {
		System.out.println("Eh recibido este argumento: " + args[args.length-1]);
		
		System.out.println("Eh recibido " + args.length + " argumentos");
		
		// calculo del area de un rectangulo
		
		int base = 7;
		int altura = 5;
		int area = base * altura;
		System.out.println("El area de un rectangulo de " + base + " base por " + altura + " de altura es: " + area);
		
		
	}

}
