package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		int numero = scanner.nextInt();
		if (numero % 2 != 0) {
			int resultado = numero * 2;
			System.out.println("El numero es impar. Su doble es: " + resultado);
		}
		else {
			int resultado = numero * 3;
			System.out.println("El numero es par. Su triple es: " + resultado);
		}
		scanner.close();
	}

}
