package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Persona persona1 = new Persona();
		System.out.println("Ingresar DNI: ");
		persona1.setDni(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Ingresar Nombre: ");
		persona1.setNombre(scanner.nextLine());
		System.out.println("Ingresar Fecha de nacimiento: (dd/mm/yyyy)");
		String fechaIngreso = scanner.nextLine();
	    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate fechaNacimiento = LocalDate.parse(fechaIngreso, formato);
		persona1.setFecha(fechaNacimiento);
		System.out.println("Ingresar Provincia: ");
		persona1.setProvincia(scanner.nextLine());
		
	    persona1.mostrarDatos();
		System.out.println("Años: " + persona1.edad(persona1.getFecha()));
		if(persona1.mayorEdad(persona1.getFecha()) == true) 
			System.out.println("Mayor de edad");
		else
			System.out.println("Menor de edad");
		
		
		System.out.println("Ingresar DNI: ");
		int dni = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingresar Nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingresar Fecha de nacimiento: (dd/mm/yyyy)");
		fechaIngreso = scanner.nextLine();
	    fechaNacimiento = LocalDate.parse(fechaIngreso, formato);
		System.out.println("Ingresar Provincia: ");
		String provincia = scanner.nextLine();
		Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
		persona2.mostrarDatos();
		System.out.println("Años: " + persona2.edad(persona2.getFecha()));
		if(persona2.mayorEdad(persona2.getFecha()) == true) 
			System.out.println("Mayor de edad");
		else
			System.out.println("Menor de edad");
		
		System.out.println("Ingresar DNI: ");
		dni = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingresar Nombre: ");
		nombre = scanner.nextLine();
		System.out.println("Ingresar Fecha de nacimiento: (dd/mm/yyyy)");
		fechaIngreso = scanner.nextLine();
	    fechaNacimiento = LocalDate.parse(fechaIngreso, formato);
		
		Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
		persona3.mostrarDatos();
		System.out.println("Años: " + persona3.edad(persona3.getFecha()));
		if(persona3.mayorEdad(persona3.getFecha()) == true) 
			System.out.println("Mayor de edad");
		else
			System.out.println("Menor de edad");
		
		
		scanner.close();
	}

}
