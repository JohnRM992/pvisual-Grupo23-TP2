package fi.unju.edu.ar.ejercicio1;
import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		System.out.println("Ingrese el numero a factorizar: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int factorial= 1;
		
		
		if (num<0 || num>10) {
			System.out.println("El numero debe estar entre el rango de 0 a 10");
		}
		else {
			
			for (int i = 1;i<=num;i++) {
				
				factorial = factorial * i;
				
			}
			System.out.println("Resultado: "+ factorial);
		}
		
		scanner.close();

	}

}
