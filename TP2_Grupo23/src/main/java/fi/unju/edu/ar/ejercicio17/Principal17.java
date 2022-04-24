package fi.unju.edu.ar.ejercicio17;

import java.time.LocalDate;
import java.time.Period;


public class Principal17 {

	public static void main(String[] args) {
		
		LocalDate fecha1= new ProcesoFecha().getFecha1();
		LocalDate fecha2 = new ProcesoFecha().getFecha2();
		System.out.println("Fecha inicial: " + fecha1);
		System.out.println("Fecha final: " + fecha2);

		Period periodo = ProcesoFecha.contarTiempoTranscurrido(fecha1,fecha2);
		
		System.out.println("\nCantidad de años, meses y dias transcurridos de fecha1 a fecha2 \n"+
				  "Años:" + periodo.getYears() + 
				  " meses:" + periodo.getMonths() + 
				  " días:"+periodo.getDays());
		
				  
		System.out.println("Fecha formateada a String: " + ProcesoFecha.formatearFecha(fecha2));
		
	}

}
