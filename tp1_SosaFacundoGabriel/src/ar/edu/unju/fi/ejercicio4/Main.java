package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar un numero entre 0 y 10 para calcular el factorial: ");
		int numero = scanner.nextInt();
		if(numero < 0 || numero > 10) {
			System.out.println("El numero ingresado no es correcto");
		}
		else
		{
			int contador = 1;
			int factor = 1;
			while (contador <= numero)
			{
				factor *= contador;
				contador++;
			}
			System.out.println("El factorial es: " + factor);
		}
		scanner.close();
	}

}
