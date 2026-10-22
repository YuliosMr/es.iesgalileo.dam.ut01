package es.iesgalileo.utilidades;

public class ReglasJuego {
	
	/*
	 * esto es un ejemplo no vino en clase
	 * Daño = ataque - defensa (minimo 0) 
	 */
	public static int calcularDanio(int ataque, int defensa) {
		int danio = ataque - defensa;
		return Math.max(danio, 0);
	}
	/*
	 * Curarse sin pasarse de la vida maxima
	 */
	
	public static int curar(int curacion, int vida) {
		int cura = curacion + vida;
		
	}

}
