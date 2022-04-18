package fi.unju.edu.ar.ejercicio7;

public class Principal7 {
	public static void main(String[] args){
		for(int i = 2; i <= 441; i = i + 37) {
			System.out.println("i " + i);
			for(int j = 40; j < 0; j = j * i) {
				System.out.println("j " + j);
			}
		}
	}
}
