package fi.unju.edu.ar;

import java.util.Scanner;

public class Mes {
	public Mes() {
		Scanner scanner = new Scanner(System.in);
		
		boolean chequeo = false;
		do {
			System.out.println("Ingrese el numero de mes: ");
			int mes = scanner.nextInt();
			
			if(mes==1) {
				System.out.println("Corresponde a Enero");
			}
			if(mes==2) {
				System.out.println("Corresponde a Febrero");
			}
			if(mes==3) {
				System.out.println("Corresponde a Marzo");
			}
			if(mes==4) {
				System.out.println("Corresponde a Abril");
			}
			if(mes==5) {
				System.out.println("Corresponde a Mayo");
			}
			if(mes==6) {
				System.out.println("Corresponde a Junio");
			}
			if(mes==7) {
				System.out.println("Corresponde a Julio");
			}
			if(mes==8) {
				System.out.println("Corresponde a Agosto");			
			}
			if(mes==9) {
				System.out.println("Corresponde a Septiembre");
			}
			if(mes==10) {
				System.out.println("Corresponde a Octubre");
			}
			if(mes==11) {
				System.out.println("Corresponde a Noviembre");
			}
			if(mes==12) {
				System.out.println("Corresponde a Diciembre");
			}
			if(mes<1 || mes>12) {
				chequeo = true;
			}
		
		}while(chequeo==false);
		scanner.close();
		
	}
}
