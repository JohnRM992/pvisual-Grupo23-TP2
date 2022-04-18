package fi.unju.edu.ar.ejercicio13;
import java.time.LocalDate;

public class Principal13 {
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Pedro");
		empleado1.setFechaIngreso(LocalDate.of(2000, 05, 07));
		empleado1.setLegajo("APU003465");
		empleado1.setEmail("Peter@unju.com");
		empleado1.setHorasTrabajadas(200);
		
		if (empleado1.getHorasTrabajadas() >= 160) {
			int extras = empleado1.getHorasTrabajadas() - 160;
			empleado1.setSueldo((extras*650)+(160*600));
		}else {
			empleado1.setSueldo(160*600);
		}
		
		System.out.println(empleado1);
	}
}
