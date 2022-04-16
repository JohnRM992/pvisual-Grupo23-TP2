package fi.unju.edu.ar;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Principal {

	public static void main(String[] args) {
		SpringApplication.run(Principal.class, args);
			System.out.println("Ingres el numero de ejercicio (1/16): ");
			Scanner scanner = new Scanner(System.in);
			int opc = scanner.nextInt();
			
			switch (opc) {
			case 1:
					Factorial factorial = new Factorial();
				break;
			case 2:
					Bisiesto bisiesto = new Bisiesto();
				break;
				
			default:
				System.out.println("Opcion incorrecta");
			
			}
	
	}
	
	}

