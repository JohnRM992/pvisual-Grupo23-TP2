package fi.unju.edu.ar.ejercicio02;
import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		  System.out.println("Ingrese un año: ");
			Scanner scanner = new Scanner(System.in);
			int valor = scanner.nextInt();
			
			if ((valor%4==0 && valor%100!=0)||valor%400==0) {
				System.out.println(valor + " Es bisiesto");
			}
			else {
				System.out.println(valor+ " No es bisiesto");
			}
			scanner.close();

	}

}
