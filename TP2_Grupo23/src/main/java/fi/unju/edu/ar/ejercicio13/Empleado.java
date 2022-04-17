package fi.unju.edu.ar.ejercicio13;

import java.time.LocalDate;

public class Empleado {
	private String nombre;
	private LocalDate fechaIngreso = LocalDate.of(1900, 01, 01);
	private String legajo = "-9999";
	private String email;
	private Integer sueldo;
	private Integer horasTrabajadas;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(String nombre, LocalDate fechaIngreso, String legajo, String email, Integer sueldo, Integer horasTrabajadas) {
		super();
			this.nombre = nombre;
			this.fechaIngreso = fechaIngreso;
			this.legajo = legajo;
			this.email = email;
			this.sueldo = sueldo;
			this.horasTrabajadas = horasTrabajadas;
	}
	public Empleado (String nombre, String legajo, Integer horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.horasTrabajadas = horasTrabajadas;
		
	}
	public Empleado(String nombre, LocalDate fechaIngreso, Integer horasTrabajadas) {
		super();
			this.nombre = nombre;
			this.fechaIngreso = fechaIngreso;
			this.horasTrabajadas = horasTrabajadas;
	}
	public Empleado(String nombre, Integer horasTrabajadas) {
		super();
			this.nombre = nombre;
			this.horasTrabajadas = horasTrabajadas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public Integer getSueldo() {
		if (horasTrabajadas >= 160) {
			int extras = horasTrabajadas - 160;
			sueldo=((extras*650)+(160*600));
		}else {
			sueldo=(160*600);
		}
		return sueldo;
	}
	public void setSueldo(Integer sueldo) {
	
		this.sueldo = sueldo;
	}
	
	public String toString() {
		return "Alumno [nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + ", legajo=" + legajo + ", email=" + email + ", sueldo= $" + sueldo + ", horasTrabajadas=" + horasTrabajadas + "hs ]";
	}
	 
}