package ar.edu.unju.fi.ejercicio7.Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar el Nombre del Empleado: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese el legajo: ");
		String legajo = scanner.nextLine();
		System.out.println("Ingrese el salario: ");
		double salario = scanner.nextDouble();
		Empleado empleado = new Empleado(nombre, legajo, salario);
		empleado.mostrarDatos();
		empleado.aumentoSalario();
		System.out.println("---CON EL AUMENTO---");
		empleado.mostrarDatos();
		scanner.close();
	}

}
