package fi.unju.edu.ar.ejercicio14;
import java.time.LocalDate;

import fi.unju.edu.ar.ejercicio13.Empleado;

public class Principal14 {
	public static void main(String[] args) {
		
		
		Empleado empleado1 = new Empleado();
		//CRTL + barra espaciadora para mostrar los constructores
		Empleado empleado2 = new Empleado("Samanta", "APU98", 342);
		Empleado empleado3 = new Empleado("Juan", LocalDate.of(2000, 05, 07), 24);
		Empleado empleado4 = new Empleado("Lucas", 234);
		
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		System.out.println(empleado4);
		
	}
}
