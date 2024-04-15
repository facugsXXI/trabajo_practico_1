package ar.edu.unju.fi.ejercicio8.Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.Model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		System.out.println("Ingresar un numero para calcular su Sumatoria y Productoria");
		calculadora.setN(scanner.nextInt());
		System.out.println("Sumatoria: " + calculadora.calcularSumatoria());
		System.out.println("Productoria: " + calculadora.calcularProductoria());
		scanner.close();
	}

}
