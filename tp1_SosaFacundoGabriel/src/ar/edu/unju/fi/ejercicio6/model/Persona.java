package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private int dni;
	private String nombre;
	private LocalDate fecha;
	private String provincia;
	
	public Persona () {
		
	}
	public Persona(int dni, String nombre, LocalDate fecha, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.provincia = provincia;
	}
	
	public Persona(int dni, String nombre, LocalDate fecha) {
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.provincia = "Jujuy" ;
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int edad (LocalDate fechaNacimiento) {
		
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		return periodo.getYears();
	}
	
	public boolean mayorEdad (LocalDate fechaNacimiento) {
		
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		
		if (periodo.getYears() >= 18) 
			return true;
		else
			return false;
	}
	
	public void mostrarDatos () {
		System.out.println("Persona [dni=" + dni + ", nombre=" + nombre + ", fecha=" + fecha + ", provincia=" + provincia + "]");
		mayorEdad(fecha);
	}
	
}
