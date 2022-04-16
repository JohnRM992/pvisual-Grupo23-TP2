package fi.unju.edu.ar.ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal6 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int nota = 0;
		boolean a = true;
		while(a) {
			try{System.out.println("Ingrese la nota: ");
			nota = leer.nextInt();
			if(nota == 6) {
				System.out.println("Alumno regulariza");
			}else {
				if(nota >= 7 && nota <= 10) {
					System.out.println("El alumno promociona");
				}else {
					if(nota >= 1 && nota <6) {
						System.out.println("El alumno desaprueba");
					}else {
						System.out.println("Valor no permitido");
						a = false;
					}
				}
			}
			}catch(InputMismatchException e){
				System.out.println("Valor no permitido");
				a = false;
			}
			
		}
	}
}
