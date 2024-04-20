package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calendar fechaNacimiento = Calendar.getInstance();
		
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese la fecha de nacimiento: ");
        System.out.print("Ingrese el dia: ");
        fechaNacimiento.set(Calendar.DAY_OF_MONTH, scanner.nextInt());
        System.out.print("Ingrese el mes: ");
        fechaNacimiento.set(Calendar.MONTH, scanner.nextInt());
        System.out.print("Ingrese el año (yyyy): ");
        fechaNacimiento.set(Calendar.YEAR, scanner.nextInt());
        
        Persona persona = new Persona(nombre, fechaNacimiento);
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento().get(Calendar.DAY_OF_MONTH) + "/" + persona.getFechaNacimiento().get(Calendar.MONTH) + "/" +persona.getFechaNacimiento().get(Calendar.YEAR) );
        System.out.println("Edad: " + persona.anios() + " años");
        System.out.println("Signo del zodiaco: " + persona.signoZodiaco());
        System.out.println("Estación: " + persona.estacion());
  

        scanner.close();

	}

}
