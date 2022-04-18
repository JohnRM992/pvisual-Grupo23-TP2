package fi.unju.edu.ar.ejercicio04;

import java.util.Scanner;

public class Principal4 {
	public static void main(String[] args) {
	
	String[] mesesDelAnio = new String[12];
	mesesDelAnio[0] = "Enero";
	mesesDelAnio[1] = "Febrero";
	mesesDelAnio[2] = "Marzo";
	mesesDelAnio[3] = "Abril";
	mesesDelAnio[4] = "Mayo";
	mesesDelAnio[5] = "Junio";
	mesesDelAnio[6] = "Julio";
	mesesDelAnio[7] = "Agosto";
	mesesDelAnio[8] = "Septiembre";
	mesesDelAnio[9] = "Octubre";
	mesesDelAnio[10] = "Noviembre";
	mesesDelAnio[11] = "Diciembre";
	
	boolean a = true;
	do{
		try {Scanner leer = new Scanner(System.in);
			System.out.println("Ingrese el numero de un mes: ");
			short mes = leer.nextShort();
				if(mes > 0 && mes <=12) {
					System.out.println("El mes es: "+mesesDelAnio[mes-1]);
				}else {
					System.out.println("No existe este mes\nFin del programa");
					a=false;}
		} catch (Exception e){System.out.println("No existe este mes\nFin del programa");
		a=false;}
	}while(a);
	
	}
}
