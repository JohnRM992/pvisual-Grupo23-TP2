package fi.unju.edu.ar.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProcesoFecha {

	LocalDate fecha1= LocalDate.of(1992, 3, 23);
	LocalDate fecha2 = LocalDate.now();
	LocalTime time1, time2 = LocalTime.now();
	LocalDateTime dateTime1, dateTime2 = LocalDateTime.now();
	
	
	public ProcesoFecha() {
		super();
	}


	public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
		super();
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
		
	}


	public ProcesoFecha(LocalTime time1, LocalTime time2) {
		super();
		this.time1 = time1;
		this.time2 = time2;
	
	}


	public ProcesoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		super();
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}


	public LocalDate getFecha1() {
		return fecha1;
	}


	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}


	public LocalDate getFecha2() {
		return fecha2;
	}


	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}


	public LocalTime getTime1() {
		return time1;
	}


	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}


	public LocalTime getTime2() {
		return time2;
	}


	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}


	public LocalDateTime getDateTime1() {
		return dateTime1;
	}


	public void setDateTime1(LocalDateTime dateTime1) {
		this.dateTime1 = dateTime1;
	}


	public LocalDateTime getDateTime2() {
		return dateTime2;
	}


	public void setDateTime2(LocalDateTime dateTime2) {
		this.dateTime2 = dateTime2;
	}
	
	public static Period contarTiempoTranscurrido(LocalDate fecha1, LocalDate fecha2) {
		
		return Period.between(fecha1, fecha2);
		
	}
	
	public static String formatearFecha(LocalDate fecha2) {
		
		DateTimeFormatter aFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDateTime = LocalDate.of(2022, Month.MAY, 23);
		String formatearString = localDateTime.format(aFormatter);
		 
		System.out.println("\nFecha original: " + localDateTime);

		return formatearString;
		
	}
	
	
}
