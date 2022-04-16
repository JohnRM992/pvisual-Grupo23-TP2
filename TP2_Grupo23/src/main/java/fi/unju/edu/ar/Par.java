package fi.unju.edu.ar;

import java.util.Scanner;

public class Par {
	
	public Par() {
		Scanner scan = new Scanner(System.in);
		for(int i= 1;i<=5;i++) {
			System.out.println("Ingrese un numero: ");
			
			
			int num = scan.nextInt();
			if (num %2 == 0) {
				System.out.println(num+ " Es par");
			}
			else {
				System.out.println(num+" Es impar");
			}
			
			
		} //fin del for
		scan.close();
	}

}
