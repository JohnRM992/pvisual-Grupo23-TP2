package fi.unju.edu.ar.ejercicio14;

import java.util.Scanner;
public class Empleado {

	public static void main(String[] args) {
		try{
			Scanner lectura = new Scanner(System.in);
			System.out.println("Ingrese su nombre: ");
			
			String nombre = lectura.nextLine();
			
			System.out.println("Ingrese su correo: ");
			
			String email = lectura.nextLine();
			
			System.out.println("Ingrese su fecha de ingreso (dd/mm/aaaa): ");
			
			String fechaIngreso= lectura.nextLine();
			
			System.out.println("Ingrese su numero de legajo: ");
			
			int legajo = lectura.nextInt();
			
			System.out.println("Ingrese la cantidad de horas trabajadas: ");
			int horasTrabajadas = lectura.nextInt();
			
			int pagoPorHora1= 600;
			int pagoPorHora2= 650;
			float sueldo;
			
			
			if(horasTrabajadas>160) {
				sueldo = (pagoPorHora1*horasTrabajadas); 
			}
			else {
				sueldo = (pagoPorHora2*horasTrabajadas);
			}
			
			lectura.close();
			
			System.out.println("#######Tus datos#######:");
			System.out.println("Nombre: "+nombre);
			System.out.println("Legajo n°: "+legajo);
			System.out.println("Correo: "+email);
			System.out.println("Fecha de ingreso: "+fechaIngreso);
			System.out.println("Tu sueldo es: $"+sueldo);
			

		}
		catch
			(Exception e){System.out.println("Error en alguno de los campos ingresados");
		}
		
	} //fin de main

}
