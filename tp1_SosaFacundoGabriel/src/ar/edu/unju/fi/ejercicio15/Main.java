package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numeroIngresado;
		do {
			System.out.println("Ingresar un numero entero entre 5 y 10");
			numeroIngresado = scanner.nextInt();
		}while(numeroIngresado < 3 || numeroIngresado > 10);
		
		String[] arregloString = new String[numeroIngresado];
		
		scanner.nextLine();
		for(int i = 0; i < numeroIngresado; i++) {
			System.out.println("Ingresar el "+ (i+1) + "º nombre: ");
			arregloString[i] = scanner.nextLine();
		}
		
		for (int j = 0; j< numeroIngresado; j++) {
			System.out.println("Posicion: "+ j + " Valor: "+ arregloString[j]);
		}
		
		for (int k = numeroIngresado -1 ; k >= 0 ; k--) {
			System.out.println(" Nombre: "+ arregloString[k]);
		}
		scanner.close();
	}

}
