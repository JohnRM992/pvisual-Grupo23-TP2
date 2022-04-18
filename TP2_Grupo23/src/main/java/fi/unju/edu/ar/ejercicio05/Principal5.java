package fi.unju.edu.ar.ejercicio05;

import java.util.Scanner;

public class Principal5 {
	public static void main(String[] args) {
	
	boolean a = true;
	do{
		try {Scanner leer = new Scanner(System.in);
			System.out.println("Ingrese el numero de un mes: ");
			short mes = leer.nextShort();
				switch (mes) {
				case 1 : System.out.println("El mes es Enero");
						break;
				case 2 : System.out.println("El mes es Febrero");						
						break;
				case 3 : System.out.println("El mes es Marzo");						
						break;
				case 4 : System.out.println("El mes es Abril");						
						break;
				case 5 : System.out.println("El mes es Mayo");
						break;
				case 6 : System.out.println("El mes es Junio");						
						break;
				case 7 : System.out.println("El mes es Julio");						
						break;
				case 8 : System.out.println("El mes es Agosto");						
						break;
				case 9 : System.out.println("El mes es Septiembre");						
						break;
				case 10 : System.out.println("El mes es Octubre");						
						break;
				case 11 : System.out.println("El mes es Noviembre");
						break;
				case 12 : System.out.println("El mes es Diciembre");
						break;
				default : System.out.println("El mes no existe\nFin del programa");
						a=false;
						break;
				}
		} catch (Exception e){System.out.println("No existe este mes\nFin del programa");
		a=false;}
	}while(a);
	
	}
}
