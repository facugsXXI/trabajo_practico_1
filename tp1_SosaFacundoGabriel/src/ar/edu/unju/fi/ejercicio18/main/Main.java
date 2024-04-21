package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	static List<Pais> countries = new ArrayList<>();
	
	static List<DestinoTuristico> destinies = new ArrayList<>();
	
	public static void main(String[] args) {
		menu();
		
	}
	
	static void menu() {
		boolean getOut = true;
		uploadCountries();
		do {
			System.out.println("\nSeleccione una opcion"
					+ "\n1 - Alta de destino turístico"
					+ "\n2 - Mostrar todos los destinos turísticos."
					+ "\n3 - Modificar el país de un destino turístico"
					+ "\n4 - Limpiar el ArrayList de destino turísticos"
					+ "\n5 – Eliminar un destino turístico"
					+ "\n6 – Mostrar los destinos turísticos ordenados por nombre."
					+ "\n7 – Mostrar todos los países."
					+ "\n8 – Salir"
					+ "\n ingresar opcion: ");
			switch (scanner.nextInt()) {
			case 1:{
				addTouristicDestiny();
				break;
			}
			case 2:{
				showAllDestinies();
				break;
			}
			case 3:{
				modifyDestiny();
				break;
			}
			case 4:{
				clearDestiniesHistory();
				break;
			}
			case 5:{
				deleteDestiny();
				break;
			}
			case 6:{
				showDestiniesSorted();
				break;
			}
			case 7:{
				showAllTheCountriesAvailables();
				break;
			}
			case 8:{
				System.out.println("sesion terminada...");
				getOut = false;
				break;
			}

			default:
				break;
			}
			
			
		} while (getOut);
		
	}

	static void uploadCountries() {
		Pais country1 = new Pais("1800FRA","Francia");
		countries.add(country1);
		Pais country2 = new Pais("2700ARG","Argentina");
		countries.add(country2);
		Pais country3 = new Pais("8090USA", "Estado Unidos");
		countries.add(country3);
		Pais country4 = new Pais("1050BRA", "Brasil");
		countries.add(country4);
	}

	static void addTouristicDestiny(){
		DestinoTuristico destiny = new DestinoTuristico();
		
		destiny.setCountry(chooseCountry());
		scanner.nextLine();
		System.out.println("ingrese NOMBRE del destino turistico");
		destiny.setName(scanner.nextLine());
		System.out.println("ingrese CODIGO del destino turistico");
		destiny.setCode(scanner.nextLine());
		System.out.println("ingrese el PRECIO");
		destiny.setPrice(enterDoubleValue());
		System.out.println("ingrese CANTIDAD de dias");
		destiny.setDaysAmount(enterIntegerValue());
		
		destinies.add(destiny);
		
	}
	
	static double enterDoubleValue() {
		double doubleValue;
		while(true) {
			try {
				doubleValue = Double.parseDouble(scanner.next());
				break;
			} catch (Exception e) {
				System.out.println("ingreso invalido, debe ingresar un valor numero");
				scanner.nextLine();
			}
		}
		return doubleValue;
	}
	
	static int enterIntegerValue() {
		int integerValue;
		while(true) {
			try {
				integerValue = Integer.parseInt(scanner.next());
				break;
			} catch (Exception e) {
				System.out.println("ingreso invalido, debe ingresar un valor numero");
				scanner.nextLine();
			}
		}
		return integerValue;
	}
	

	static Pais chooseCountry() {
		while(true) {
			
			System.out.println("\neliga el codigo valido del pais"
					+ "\n 2700ARG para Argentina"
					+ "\n 1800FRA para Francia"
					+ "\n 8090USA para Estados Unidos"
					+ "\n 1050BRA para Brasil");
			String code = scanner.next();
			for (Pais country : countries) {
				if(country.getCode().equals(code))
					return country;
			}
		}	
		
	}

	static void showAllDestinies() {
		System.out.println("\nDestinos guardados: "+destinies.size());
		for (DestinoTuristico destiny : destinies) {
			System.out.println("Codigo destino: "+destiny.getCode() +" - "+destiny.getName()+" "+destiny.getCountry().getName());
		}
	}
	

	static void modifyDestiny() {
		scanner.nextLine();
		System.out.println("\ningrese CODIGO del destino a modificar");
		String destinyCode = scanner.nextLine();
		for (DestinoTuristico destiny : destinies) {
			if(destiny.getCode().equals(destinyCode)) {
				boolean stillModifyingPlayer = true;
				do {	
				System.out.println("\nSELECCIONE INFO A MODIFICAR"
						+ "\n1-nombre del destino: "+destiny.getName()
						+ "\n2-pais destino: "+destiny.getCountry().getName()+" codigo: "+destiny.getCountry().getCode()
						+ "\n3-Salir: ");
				int option = enterIntegerValue();
				scanner.nextLine();
					switch (option) {
					case 1:{
						System.out.println("modificando nombre: ");
						destiny.setName(scanner.nextLine());
						break;
					}
					case 2:{
						System.out.println("moficando pais: ");
						destiny.setCountry(chooseCountry());
						break;
					}
					
					case 3:{
						stillModifyingPlayer = false;
						break;
					}

					default:
						break;
					}					
				}while(stillModifyingPlayer);
				break;
			}
			
		}
	}

	static void clearDestiniesHistory() {
		destinies.clear();
		System.out.println("\nHistorial de destinos borrados con exito...");
	}
	
	static void deleteDestiny() {
		scanner.nextLine();
		System.out.println("\ningrese el CODIGO del destino turistico que desea eliminar");
		String destinyCode = scanner.nextLine();
			Iterator<DestinoTuristico> iterator = destinies.iterator();
			while(iterator.hasNext()) {
				DestinoTuristico destiny = iterator.next();
				if(destiny.getCode().equals(destinyCode)) {
					iterator.remove();
					break;
				}
				
			}	
	}
	
	static void showDestiniesSorted() {
		List<String> destinyNames = new ArrayList<>();
		for (DestinoTuristico destiny : destinies) {
			destinyNames.add(destiny.getName()+" "+destiny.getCode());
		}
		Collections.sort(destinyNames);
		System.out.println("\nDestinos ordenados: ");
		for (String name : destinyNames) {
			System.out.println(name);
		}
	}
	
	
	static void showAllTheCountriesAvailables() {
		System.out.println("\nPaises disponibles");
		for (Pais country : countries) {
			System.out.println(country.getName());
		}
	}
}