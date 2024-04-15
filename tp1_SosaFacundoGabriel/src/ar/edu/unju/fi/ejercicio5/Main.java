package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entre 1 y 9 para mostrar su tabla de multiplicar");
		int numero = scanner.nextInt();
		if (numero < 1 || numero > 9)
		{
			System.out.println("El numero ingresado no es correcto");
		}
		else
		{
			int resultado = 0;
			for (int i = 0; i <= 10 ; i++ )
			{
				resultado = numero * i;
				System.out.println(numero + " x " + i + " = " + resultado);
			}
		}
		scanner.close();
	}

}
