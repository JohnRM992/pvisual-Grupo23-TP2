package fi.unju.edu.ar.ejercicio15;

import java.util.Calendar;
import java.util.Scanner;

public class Principal15 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese el nombre: ");
		String nombre = leer.nextLine();
		int dia, mes, anio;
		System.out.println("Ingrese fecha de nacimiento");
		System.out.print("Dia: ");
		dia= leer.nextInt();
		System.out.print("Mes: ");
		mes= leer.nextInt();
		System.out.println("Año: ");
		anio= leer.nextInt();
		
		if(dia>31 || mes>12 || anio >2022) {
			System.out.println("Se han ingresado valores incorrectos");	
		}
		else {
			System.out.println(nombre);
		System.out.println("Edad: " + MostrarEdad(anio)+" años");
		System.out.println("Signo del Zodiaco: " + SignoZodiaco(dia, mes));
		System.out.println("Estacion: " + Estacion(dia, mes));
		}
		leer.close();
		
	}
	
	public static String SignoZodiaco(int dd, int mm) {
		String signo=null;
		if ((dd>=20 && mm==1)||(dd<=18&&mm==2)) 
		{
			signo = "Acuario";
		}	
		if ((dd>=19 && mm==2)||(dd<=20&&mm==3)) 
		{
			signo = "Piscis";
		}
		if ((dd>=21 && mm==3)||(dd<=19&&mm==4)) 
		{
			signo = "Aries";
		}
		if ((dd>=20 && mm==4)||(dd<=20&&mm==5)) 
		{
			signo = "Tauro";
		}
		if ((dd>=21 && mm==5)||(dd<=20&&mm==6)) 
		{
			signo = "Geminis";
		}
		if ((dd>=21 && mm==6)||(dd<=22&&mm==7)) 
		{
			signo = "Cancer";
		}
		if ((dd>=23 && mm==7)||(dd<=22&&mm==8)) 
		{
			signo = "Leo";
		}
		if ((dd>=23 && mm==8)||(dd<=22&&mm==9)) 
		{
			signo = "Virgo";
		}
		if ((dd>=23 && mm==9)||(dd<=22&&mm==10)) 
		{
			signo = "Libra";
		}
		if ((dd>=23 && mm==10)||(dd<=21&&mm==11)) 
		{
			signo = "Escorpio";
		}
		if ((dd>=22 && mm==11)||(dd<=21&&mm==12)) 
		{
			signo = "Sagitario";
		}
		if ((dd>=22 && mm==12)||(dd<=19&&mm==1)) 
		{
			signo = "Capricornio";
		}
		return signo;
	}
		
	public static int MostrarEdad(int aaaa) {
		Calendar unCalendario = Calendar.getInstance();
		int resultado= unCalendario.get(Calendar.YEAR)-aaaa;
		return resultado;
	}
	
	public static String Estacion(int dia, int mes) {
		String estacion=null;
		if (((mes==12 && dia>=21)||mes==1||mes==2)||(mes==3 && dia <=20)) {
			estacion= "Verano";
		}
		if (((mes==3 && dia>=21)||mes==4||mes==5)||(mes==6 && dia <=20)) {
			estacion = "Otoño";
		}
		if (((mes==6 && dia>=21)||mes==7||mes==8)||(mes==9 && dia <=20)) {
			estacion = "Invierno";
		}
		if (((mes==9 && dia>=21)||mes==10||mes==11)||(mes==12 && dia <=20)) {
			estacion = "Primavera";
		}
		return estacion;
	}

}
