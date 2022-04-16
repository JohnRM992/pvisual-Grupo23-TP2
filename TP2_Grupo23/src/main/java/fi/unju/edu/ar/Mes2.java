package fi.unju.edu.ar;

import java.util.Scanner;

public class Mes2 {
	public Mes2() {
		Scanner scanner = new Scanner(System.in);
		
		boolean chequeo = false;
		do {
			System.out.println("Ingrese el numero de mes: ");
			int mes = scanner.nextInt();
			switch (mes) {
			case 1:
				System.out.println("Corresponde a Enero");
				break;
			case 2:
				System.out.println("Corresponde a Febrero");
				break;
			case 3:
				System.out.println("Corresponde a Marzo");
				break;
			case 4:
				System.out.println("Corresponde a Abril");
				break;
			case 5:
				System.out.println("Corresponde a Mayo");
				break;
			case 6:
				System.out.println("Corresponde a Junio");
				break;
			case 7:
				System.out.println("Corresponde a Julio");
				break;
			case 8:
				System.out.println("Corresponde a Agosto");			
				break;
			case 9: 
				System.out.println("Corresponde a Septiembre");
				break;
			
			case 10:
				System.out.println("Corresponde a Octubre");
				break;
			case 11:
				System.out.println("Corresponde a Noviembre");
				break;
			
			case 12:
				System.out.println("Corresponde a Diciembre");
				break;
			default:
				System.out.println("Opcion incorrecta");
				chequeo=true;
				break;
		
			}
			
		}while(chequeo==false);
		scanner.close();
		
	}
}
