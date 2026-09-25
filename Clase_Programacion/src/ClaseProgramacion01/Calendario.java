package ClaseProgramacion01;

import java.time.LocalDate;
import java.time.YearMonth;

public class Calendario {

	public static void main(String[] args) {
		
		//obtener la fecha actual
		LocalDate hoy = LocalDate.now();
		System.out.println("Fecha actual: " + hoy);
		
		//obtenemos el mez y año y dias del mes
		YearMonth mesActual = YearMonth.from(hoy);
		
		int diasDelMes = mesActual.lengthOfMonth();
		
		System.out.println("Dias en este mes (" + mesActual.getMonth() + "): " + diasDelMes);
		
	}

}
