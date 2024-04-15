package ar.edu.unju.fi.ejercicio8.Model;

public class CalculadoraEspecial {
	private int n;

	public CalculadoraEspecial() {
		
	}
	
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double calcularSumatoria() {
		double resultado = 0;
		for(int i = 1; i <= n ; i++) {
		resultado = resultado + Math.pow((((i+1)*i)/2), 2);
		}
		return resultado;
	}
	
	public double calcularProductoria () {
		double resultado = 1;
		for(int i = 1; i <= n ; i++) {
			resultado = resultado * i * (i+4);
		}
		return resultado;
	}
	
}
