package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[8];
		for(int i = 0; i < 8;i++) {
			System.out.println("Ingrese un numero entero: ");
			numeros[i] = scanner.nextInt();
		}
		for(int i = 0; i < 8;i++) {
			System.out.println("Valor indice: " + i + " Valor numero: " + numeros[i]);
		}
		scanner.close();
	}
}
