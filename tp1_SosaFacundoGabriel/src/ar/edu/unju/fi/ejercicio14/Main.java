package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numeroIngresado;
		do {
			System.out.println("Ingresar un numero entero entre 3 y 10");
			numeroIngresado = scanner.nextInt();
		}while(numeroIngresado < 3 || numeroIngresado > 10);
		
		int[] arregloEntero = new int[numeroIngresado];
		
		for(int i = 0; i < numeroIngresado; i++) {
			System.out.println("Ingresar el "+ (i+1) + "º numero entero: ");
			arregloEntero[i] = scanner.nextInt();
		}
		
		int suma = 0;
		for (int j = 0; j< numeroIngresado; j++) {
			System.out.println("Posicion: "+ j + " Valor: "+ arregloEntero[j]);
			suma = suma + arregloEntero[j];
		}
		
		System.out.println("Suma Total: " + suma);
		scanner.close();
	}

}
