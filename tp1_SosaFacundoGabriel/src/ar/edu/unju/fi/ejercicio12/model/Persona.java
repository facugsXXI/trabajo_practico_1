package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	
	String nombre;
	Calendar fechaNacimiento;
	
	
	
	public Persona(String nombre, Calendar fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public int anios () {
		
		Calendar hoy = Calendar.getInstance();
		long milisegundos = hoy.getTimeInMillis() - fechaNacimiento.getTimeInMillis();
		long dias = milisegundos/1000/60/60/24;
		int anios = (int) dias / 360;
		return anios;
	}
	
	
	 public String signoZodiaco() {
		 
	        int mes = fechaNacimiento.get(Calendar.MONTH); 
	        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
	        
	       // System.out.println("MES: "+mes+" DIA: "+dia);
	        
	        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
	            return "Acuario";
	        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
	            return "Piscis";
	        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
	            return "Aries";
	        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
	            return "Tauro";
	        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
	            return "Géminis";
	        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
	            return "Cáncer";
	        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
	            return "Leo";
	        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
	            return "Virgo";
	        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
	            return "Libra";
	        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
	            return "Escorpio";
	        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
	            return "Sagitario";
	        } else {
	            return "Capricornio";
	        }
	 }
	 public String estacion() {
		 switch (fechaNacimiento.get(Calendar.MONTH)+1) {
		case 12,1,2:
			return "Verano";
		case 3,4,5:
			return "Otoño";
		case 6,7,8:
			return "Invierno";
		case 9,10,11:
			return "Primavera";
		default:
			return "error";
		}
	 }
	
}
