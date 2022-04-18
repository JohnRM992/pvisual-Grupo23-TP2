package fi.unju.edu.ar.ejercicio16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese n");
		int entrada = teclado.nextInt();
		double calculo = CalculoMatematico.calcularSumatoria(entrada);
		double calculo1 = CalculoMatematico.calcularProductoria(entrada);
		System.out.println("Sumatoria = " + calculo);
		System.out.println("Productoria = " + calculo1);
		
	}

}
