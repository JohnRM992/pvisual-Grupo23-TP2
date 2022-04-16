package fi.unju.edu.ar.ejercicio3;

import java.util.Scanner;

public class Principal3 {
public static void main(String[] args) {
	boolean a; //Es entero?
	for(int i = 0; i < 5; i++) { //pide 5 numeros enteros
		
		do{	//Control del tipo de dato
			System.out.println("Ingrese un número entero: ");
			try{Scanner leer = new Scanner(System.in);
				int num = leer.nextInt();
				a=true;
				if(num % 2 == 0){
					System.out.println("El número "+num+" es par");
				}else {System.out.println("El número "+num+" es impar");}
			}catch(Exception e){
				System.out.println("no es un numero entero");
				a = false;}
			} while(!a); //Mientras no sea entero
		
	}
}
}
