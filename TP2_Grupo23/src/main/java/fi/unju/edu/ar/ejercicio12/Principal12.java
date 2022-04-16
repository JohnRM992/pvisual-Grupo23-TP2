package fi.unju.edu.ar.ejercicio12;

import java.lang.Math;
import java.util.Scanner;

public class Principal12 {
	public static void main(String[] args) {
		double g = 9.81;
		System.out.println("Ingrese una altura: ");
		Scanner leer = new Scanner(System.in);
		double altura = leer.nextDouble();
		Double tiempo = Math.sqrt(2*altura/g);
		System.out.println("El tiempo en que el objeto tarda en caer desde " + altura + " m" +" es: " + String.format("%.2f",tiempo) + " segundos");
	}
}
