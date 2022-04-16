package fi.unju.edu.ar;

import java.util.Scanner;

public class Bisiesto {
   public Bisiesto() {
	   System.out.println("Ingrese un año: ");
		Scanner scanner = new Scanner(System.in);
		int valor = scanner.nextInt();
		
		if ((valor%4==0 && valor%100!=0)||valor%400==0) {
			
		}
		else {
			System.out.println(valor+ " No es bisiesto");
		}
   }
	
}
