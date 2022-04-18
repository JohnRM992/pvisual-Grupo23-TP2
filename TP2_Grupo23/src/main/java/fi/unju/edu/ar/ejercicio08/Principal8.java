package fi.unju.edu.ar.ejercicio08;

public class Principal8 {
	public static void main(String[] args) {
		boolean a = true;
		int i = 1;
		do {
			System.out.print((4 * i) + " ");
			i++;
			if (i > 25) {
				a = false;
			}
		}while(a);
	}
}
