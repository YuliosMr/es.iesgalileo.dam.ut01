package GACHA;

import java.util.Scanner;
import java.util.Random;

public class GachaGame {
	public static void main(String[] args) {
		
		System.out.println("El programa arranco");
	
		Scanner escribir = new Scanner(System.in);
		

		
		int monedas = 9999;
		int ramas = 0;
		int espadas = 0;
		int pistolas = 0;
		int snipers = 0;
		
		while (true) {
			

		System.out.println("======================");
		System.out.println("      JAVA GACHA	  ");
		System.out.println("======================");
		System.out.println("Monedas: " + monedas);
		
		System.out.println("1. Conseguir monedas");
		System.out.println("2. Hacer una tirada");
		System.out.println("3. Hacer cinco tiradas");
		System.out.println("4. Ver coleccion");
		System.out.println("5. Salir");
		
		
		System.out.print("Elige una opcion: ");
		int opcion = escribir.nextInt();
		escribir.nextLine();
		
		// int opcion = Integer.parseInt(escribir.nextLine());
		
		
	
		
		// opcion 1
		System.out.println("Has elegido la opcion: " + opcion);
		   if (opcion == 1) {
			   String codigo = generadorDeCodigo(3);
			   System.out.println("Escribe estas letras para ganar 10 monedas");
			   System.out.println("Codigo: " + codigo);
			   System.out.print("Escribe el codigo: ");
			   String respuesta = escribir.next();
			   
			   if (codigo.equals(respuesta)) {
				   System.out.println("Genial! 10 monedas adquiridas.");
				   monedas = monedas + 10;
			   } else {
				   System.out.println("Codigo erroneo vuelva a intentarlo.");
			   }
			   
		   }  
		   if (opcion == 2) {
			   System.out.println("Has elegido Hacer una tirada");
			   System.out.println("Has realizado una tirada!");
			   if (monedas >= 100) {
				   monedas = monedas - 100;
				   int suerte = (int) (Math.random() * 100);
				   if (suerte < 60) {
					   System.out.println("!Has conseguido una rama!");
					   System.out.println("Rareza: Comun");
					   ramas++;
				   } else if (suerte < 85) {
					   System.out.println("!Has conseguido una espada!");
					   System.out.println("Rareza: Raro");
					   espadas++;
				   } else if (suerte < 97) {
					   System.out.println("!Has conseguido una pistola!");
					   System.out.println("Rareza: Epico");
					   pistolas++;
				   } else {
					   System.out.println("¡¡¡LEGENDARIO!!!"
					   		+ "HAS CONSEGUIDO UNA SNIPER!!!");
					   snipers++;
				   }
				   
				   
				   System.out.println("te quedan " + monedas + " monedas.");
				   
			   } else {
				   System.out.println("No tienes suficientes monedas.");
				   System.out.println("Necesitas 100 monedas para tirar.");
			   }
		   }
		   
		   if (opcion == 3) {
			   System.out.println("Has elegido Hacer cinco tiradas");
			   if (monedas >= 500) {
				   monedas = monedas - 500;
				   
				   System.out.println("Has realizado 5 tiradas");
				   for (int i = 0; i < 5; i++) {
					   int suerte = (int) (Math.random() * 100);
					   if (suerte < 60) {
						   System.out.println("!Has conseguido una rama!");
						   System.out.println("Rareza: Comun");
						   ramas++;
					   } else if (suerte < 85) {
						   System.out.println("!Has conseguido una espada!");
						   System.out.println("Rareza: Raro");
						   espadas++;
					   } else if (suerte < 97) {
						   System.out.println("!Has conseguido una pistola!");
						   System.out.println("Rareza: Epico");
						   pistolas++;
					   } else {
						   System.out.println("¡¡¡LEGENDARIO!!!"
						   		+ "HAS CONSEGUIDO UNA SNIPER!!!");
						   snipers++;
					   }
				   }
			   } else {
				   System.out.println("No tienes sufiecientes monedas.");
			   }
		   }
		   
		   if (opcion == 4) {
			   System.out.println("Esta es tu coleccion");
			   System.out.println("Ramas: " + ramas);
			   System.out.println("Espadas: " + espadas);
			   System.out.println("Pistolas: " + pistolas);
			   System.out.println("Snipers: " + snipers);
			   
		   }
		   
		   if (opcion == 5) {
			   System.out.println("Hasta luego!");
			  break;
		   }
		   
		}
		   
		
		
		
		
		
		
		
		
	}
	
	private static String generadorDeCodigo(int longitud) {
		String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String codigo = "";
		
		for (int i = 0; i < longitud; i++) 
		{
			int aleatorio = (int) 
					(Math.random() * letras.length());
			codigo = codigo + letras.charAt(aleatorio);
	}
		return codigo;
	}

}
