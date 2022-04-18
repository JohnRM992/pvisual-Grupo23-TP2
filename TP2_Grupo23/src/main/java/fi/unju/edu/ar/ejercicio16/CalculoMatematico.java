package fi.unju.edu.ar.ejercicio16;

public class CalculoMatematico {

	private int n;
	private static double suma;
	
	public static double calcularSumatoria (int n) {
		
		double suma=0;
		for(int k = 1; k <= n;k++) {
			suma = suma + (Math.pow((k*(k+1)/2), 2));
			
		}
		return suma;
	}
	
	public static double calcularProductoria (int n) {
		
		double productoria=1;
		for(int k = 1; k <= n;k++) {
			productoria = productoria * ( k*(k+4));
		
		}
		return productoria;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public Double getSuma() {
		return suma;
	}

	public void setSuma(Double suma) {
		this.suma = suma;
	}
}
