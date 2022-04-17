package fi.unju.edu.ar.ejercicio13;

import java.util.Scanner;


public class Empleado {
	public String nombre;
	public String email;
	public String fechaIngreso;
	public int legajo;
	public int horasTrabajadas;
	
	


	public Empleado(String nombreEmpleado, String emailEmpleado, String fechaIngresoEmpleado, int legajoEmpleado,
			int horasTrabajadasEmpleado) {
		// TODO Auto-generated constructor stub
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getFechaIngreso() {
		return fechaIngreso;
	}




	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}




	public int getLegajo() {
		return legajo;
	}




	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}




	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}




	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	



	public static void main(String[]args) {
		//variables
		String nombreEmpleado="";
		String emailEmpleado="";
		String fechaIngresoEmpleado="";
		int legajoEmpleado=0;
		int horasTrabajadasEmpleado=0;
		int sueldo = 0;
		
		//lecturas de teclado
		
		Scanner lectura = new Scanner(System.in);
		do {
		System.out.println("Ingrese su nombre: ");
		nombreEmpleado = lectura.nextLine();
		}while (nombreEmpleado.equalsIgnoreCase(""));
		
		do {
		System.out.println("Ingrese su correo: ");
		emailEmpleado = lectura.nextLine();
		}while (emailEmpleado.equalsIgnoreCase(""));
		System.out.println("Ingrese la fecha de ingreso (dd-mm-aaaa): ");
		fechaIngresoEmpleado = lectura.nextLine();
		
		do {
		System.out.println("Ingrese su numero de legajo: ");
		legajoEmpleado = lectura.nextInt();
		}while(legajoEmpleado == 0);
		do {
		System.out.println("Ingrese las horas trabajadas: ");
		horasTrabajadasEmpleado = lectura.nextInt();
		}while(horasTrabajadasEmpleado == 0);

		lectura.close();
		
		//calculo del sueldo
		if (horasTrabajadasEmpleado <= 160) {
		      sueldo = 600 * horasTrabajadasEmpleado;
		    } else {
		      sueldo= (160 * 600) + ((horasTrabajadasEmpleado - 160) * 650);
		    }
			
		//acceso a los metodos,asignacion
		Empleado empleado = new Empleado(nombreEmpleado,emailEmpleado,fechaIngresoEmpleado,legajoEmpleado,horasTrabajadasEmpleado);
		empleado.setNombre(nombreEmpleado);
		empleado.setEmail(emailEmpleado);
		empleado.setFechaIngreso(fechaIngresoEmpleado);
		empleado.setLegajo(legajoEmpleado);
		empleado.setHorasTrabajadas(horasTrabajadasEmpleado);
		
		
		//acceso a los metodos,salida por pantalla
		System.out.println("Nombre: " +empleado.getNombre());
		System.out.println("Correo: " +empleado.getEmail());
		System.out.println("Fecha de ingreso: " +empleado.getFechaIngreso());
		System.out.println("Numero de legajo: " +empleado.getLegajo());
		System.out.println("Horas trabajadas: " +empleado.getHorasTrabajadas());
		System.out.println("Sueldo: $" +sueldo);
		
		
		
		
		
	}
	
	
}

