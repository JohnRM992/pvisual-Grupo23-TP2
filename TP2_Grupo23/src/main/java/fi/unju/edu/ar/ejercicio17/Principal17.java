package fi.unju.edu.ar.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

import org.springframework.format.datetime.joda.LocalDateParser;


public class Principal17 {

	public static void main(String[] args) {
		
		ProcesoFecha pf1= new ProcesoFecha();
		
		pf1.fecha1 = LocalDate.of(1992, 3, 10);
		pf1.fecha2 = LocalDate.of(2022, 4, 23);
		System.out.println("Punto b1:\nFecha1: " + pf1.fecha1);
		System.out.println("Fecha2: " + pf1.fecha2);
		
		ProcesoFecha pf2 = new ProcesoFecha();
		pf2.time1 = LocalTime.of(13, 23);
		pf2.time2 = LocalTime.of(15, 34);
		System.out.println("Punto b2:\nTime1 original: " + pf2.time1 +
						   "\nTime2 original: " + pf2.time2);
		
		pf2.time1 = pf2.time1.plusHours(5);
		pf2.time2 = pf2.time2.minusMinutes(20);
		System.out.println("Time1 sumado 5 horas " + pf2.time1);
		System.out.println("Time2 restado 20 minutos " + pf2.time2);  

		LocalDate fecha1 = LocalDate.of(1992, 3, 23) ;
		LocalDate fecha2 = LocalDate.now() ;
		
		//b3
		
				String fecha1f = ProcesoFecha.formatearFecha2(pf1.fecha1);
				String fecha2f = ProcesoFecha.formatearFecha2(pf1.fecha2);
				
				System.out.println("\nPunto b3\n");
				System.out.println(fecha1f);
				System.out.println(fecha2f);
				ProcesoFecha.compararFecha(fecha1f,fecha2f);
		
		
		ProcesoFecha pf3 = new ProcesoFecha();
		pf3.dateTime1 = LocalDateTime.of(LocalDate.of(2022,5,15), LocalTime.now());
		pf3.dateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.of(19,22,55,12));
		System.out.println("\nPunto b4:\n ");
		System.out.println("dateTime1: \n"+ pf3.dateTime1);
		System.out.println("dateTime2:  \n"+ pf3.dateTime2);
							
		
		

		new ProcesoFecha();
		Period pf4 = ProcesoFecha.contarTiempoTranscurrido(fecha1, fecha2);
		
		System.out.println("\nPunto b5\nHan transcurrido "+
				  pf4.getYears() + " años, "+ 
				  pf4.getMonths() + " meses y " + 
				  pf4.getDays() + " días desde la fecha1 hasta la fecha2");
		
				  
		System.out.println("Fecha formateada a String: " + ProcesoFecha.formatearFecha(pf1.fecha2));
		
		
		
	}

}
