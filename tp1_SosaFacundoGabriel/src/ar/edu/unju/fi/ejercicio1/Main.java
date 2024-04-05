package ar.edu.unju.fi.ejercicio1;

public class Main {

	public static int sumar (int... numeros) {
		int suma = 0;
		for (int num : numeros) {
			suma += num;
		}
		return suma;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 6;
		int n2 = 2; 
		int n3 = 3;
		int n4 = 4; 
		int n5 = 5;
		
		double promedio = sumar(n1, n2, n3, n4, n5)/5.0;
		System.out.println("Promedio= "+  promedio);
	}

}
