package fi.unju.edu.ar.ejercicio14;

import java.util.Date;
import java.util.Scanner;
public class Empleado {

	private String nombre;
	private String email;
	private String fechaIngreso;
	private int legajo;
	private int horasTrabajadas;
	public static void main(String[] args) {
		
	
		
	}
	public Empleado() {
		super();
	}
	public Empleado(String nombre, int legajo, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.horasTrabajadas = horasTrabajadas;
	}
	public Empleado(String nombre, String fechaIngreso, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.horasTrabajadas = horasTrabajadas;
	}
	public Empleado(String nombre, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
	}
		Scanner lectura = new Scanner(System.in);
		
}
