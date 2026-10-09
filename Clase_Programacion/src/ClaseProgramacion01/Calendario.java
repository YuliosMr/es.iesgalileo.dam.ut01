package ClaseProgramacion01;

import java.time.LocalDate;
import java.time.YearMonth;

public class Calendario {

	public static void main(String[] args) {
		
//		//obtener la fecha actual
//		LocalDate hoy = LocalDate.now();
//		System.out.println("Fecha actual: " + hoy);
//		
//		//obtenemos el mez y año y dias del mes
//		YearMonth mesActual = YearMonth.from(hoy);
//		
//		int diasDelMes = mesActual.lengthOfMonth();
//		
//		System.out.println("Dias en este mes (" + mesActual.getMonth() + "): " + diasDelMes);
//		
		
		LocalDate hoy = LocalDate.of(2026, 10, 06);
		String curso = "Programacion";
		StringBuilder nota = new StringBuilder("Clase: ");
		
		System.out.println(hoy.getDayOfWeek());
		System.out.println(hoy.plusDays(30));
		System.out.println(curso.length());
		System.out.println(curso.toUpperCase());
		
		nota.append(curso);
		System.out.println(nota);
		
		
		String puntaje = "Maximo puntaje";
		StringBuilder Puntos = new StringBuilder("Puntaje: ");
		
		Puntos.append(puntaje);
		System.out.println(Puntos);
		
		
		
		
	}

}
