package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	static List<Jugador> players = new ArrayList<>();
	
	static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static void main(String[] args) {
		menu();
	}

	static void menu() {
		boolean getOut = true;
		do {
			System.out.println("\nSeleccione una opcion"
					+ "\n1 - Alta jugador"
					+ "\n2 - Mostrar los datos del jugador"
					+ "\n3 - Mostrar todos los jugadores ordenados por apellido"
					+ "\n4 - Modificar los datos de un jugador"
					+ "\n5 – Eliminar un jugador"
					+ "\n6 – Mostrar la cantidad total de jugadores que tiene el ArrayList."
					+ "\n7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad"
					+ "\n8 – Salir"
					+ "\n ingresar opcion: ");
			switch (scanner.nextInt()) {
			case 1:{
				players.add(addNewPlayer());
				break;
			}
			case 2:{
				showPlayerInfo();
				break;
			}
			case 3:{
				showPlayersSorted();
				break;
			}
			case 4:{
				modifyPlayer();
				break;
			}
			case 5:{
				deletePlayer();
				break;
			}
			case 6:{
				showPlayersAmount();
				break;
			}
			case 7:{
				showPlayersByNacionality();
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
	
	static Jugador addNewPlayer() {
		Jugador player = new Jugador();
		try {
			System.out.println("ingrese nombre");
			scanner.nextLine();
			player.setName(scanner.nextLine());
			System.out.println("ingrese apellido");
			player.setSurname(scanner.nextLine());
			System.out.println("ingrese fecha de nacimiento (dd/MM/yyyy), ej: 03/02/1999 ");
			player.setBirthday(parseStringToLocalDate());
			System.out.println("ingrese nacionalidad");
			player.setNacionality(scanner.nextLine());
			System.out.println("estatura");
			player.setHeigth(enterDoubleValue());
			scanner.nextLine();
			System.out.println("peso");
			player.setWeigth(enterDoubleValue());
			scanner.nextLine();
			player.setPosition(choosePosition());
		return player;
		}
		catch (Exception e) {
			System.out.println("debe ingresar un valor numerico");
			return null;	
		}
	}
	
	static LocalDate parseStringToLocalDate() {
		LocalDate birthday;
		while(true) {
			try {
				birthday =  LocalDate.parse(scanner.nextLine(),FORMATTER);
				break;
			} catch (Exception e) {
				System.out.println("formato de fecha erronea");
				
			}
		}
		return birthday;
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
	
	
	static String choosePosition() {
		int option;
		do {
			System.out.println("eliga posicion"
					+ "\n1-arquero"
					+ "\n2-defensor"
					+ "\n3-medio"
					+ "\n4-delantero");
			option = scanner.nextInt();
		} while (option>4 || option<1);
		
		switch (option) {
		case 1:
			return "arquero";
		case 2:
			return "defensor";
		case 3:
			return "medio";
		case 4:
			return "delantero";
		}
		return null;
	}
	
	static void showPlayerInfo() {
		try {
			scanner.nextLine();
			System.out.println("ingrese el nombre del jugador que desea mostrar info");
			String name = scanner.nextLine();
			System.out.println("ingrese apellido del jugador que desea mostrar info");
			String surname = scanner.nextLine();
			for (Jugador jugador : players) {
				if(jugador.getName().equals(name) && jugador.getSurname().equals(surname)) {
					System.out.println("\nINFO JUGADOR"
							+ "\nnombre: "+jugador.getName()
							+ "\napellido: "+jugador.getSurname()
							+ "\nfecha nacimiento: "+jugador.getBirthday().format(FORMATTER)
							+ "\nnacionalidad: "+jugador.getNacionality()
							+ "\nestatura: "+jugador.getHeigth()
							+ "\npeso: "+jugador.getWeigth()
							+ "\nposicion"+jugador.getPosition());
				break;
				}
				
			}
			
			
		} catch (Exception e) {
			System.out.println("no existe el jugador");
		}
	}
	
	static void showPlayersSorted() {
		List<String> playersSorted = new ArrayList<>();
		for (Jugador jugador : players) {
			playersSorted.add(jugador.getSurname()+" "+jugador.getName());
		}
		Collections.sort(playersSorted);
		System.out.println("**Jugadores**");
		for (String jugador : playersSorted) {
			System.out.println(jugador);
		}
	}
	
	static void modifyPlayer() {
		try {
			scanner.nextLine();
			System.out.println("ingrese el nombre del jugador a modificar");
			String name = scanner.nextLine();
			System.out.println("ingrese apellido del jugador a modificar");
			String surname = scanner.nextLine();
			for (Jugador jugador : players) {
				if(jugador.getName().equals(name) && jugador.getSurname().equals(surname)) {
					boolean stillModifyingPlayer = true;
					do {	
					System.out.println("SELECCIONE INFO A MODIFICAR"
							+ "\n1-nombre: "+jugador.getName()
							+ "\n2-apellido: "+jugador.getSurname()
							+ "\n3-fecha nacimiento: "+jugador.getBirthday().format(FORMATTER)
							+ "\n4-nacionalidad: "+jugador.getNacionality()
							+ "\n5-estatura: "+jugador.getHeigth()
							+ "\n6-peso: "+jugador.getWeigth()
							+ "\n7-posicion: "+jugador.getPosition()
							+ "\n8-salir"
							+ "\n eliga opcion");
					int option = scanner.nextInt();
					scanner.nextLine();
						switch (option) {
						case 1:{
							System.out.println("modificando nombre: ");
							jugador.setName(scanner.nextLine());
							break;
						}
						case 2:{
							System.out.println("moficando apellido: ");
							jugador.setSurname(scanner.nextLine());
							break;
						}
						case 3:{
							System.out.println("modificando fecha de nacimiento: ");
							jugador.setBirthday(parseStringToLocalDate());
							break;
						}
						case 4:{
							System.out.println("modificando nacionalidad: ");
							jugador.setNacionality(scanner.nextLine());
							break;
						}
						case 5:{
							System.out.println("modificando estatura: ");
							jugador.setHeigth(enterDoubleValue());
							break;
						}
						case 6:{
							System.out.println("modificando peso: ");
							jugador.setWeigth(enterDoubleValue());
							break;
						}
						case 7:{
							System.out.println("modificando posicion: ");
							jugador.setPosition(choosePosition());
							break;
						}
						case 8:{
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
			
			
		} catch (Exception e) {
			System.out.println("no existe el jugador");
		}
	}
	
	static void deletePlayer() {
		try {
			scanner.nextLine();
			int index = 0;
			System.out.println("ingrese el nombre del jugador a eliminar");
			String name = scanner.nextLine();
			System.out.println("ingrese apellido del jugador a eliminar");
			String surname = scanner.nextLine();
			for (Jugador jugador : players) {
					if(jugador.getName().equals(name) && jugador.getSurname().equals(surname)) {
						players.remove(index);
						System.out.println("jugador eliminado...");
						break;
					}
				index++;
			}
			
			
		} catch (Exception e) {
			System.out.println("no existe el jugador");
		}
	}
	
	static void showPlayersAmount() {
		System.out.println("Jugadores guardados: "+players.size());
	}
	
	static void showPlayersByNacionality() {
		scanner.nextLine();
		System.out.println("ingrese nacionalidad");
		String nacionality = scanner.next();
		int quantity = 0;
		for (Jugador jugador : players) {
			if(jugador.getNacionality().equals(nacionality)) {
				System.out.println(jugador.getName()+" "+jugador.getSurname());
				quantity++;
			}
		}
		System.out.println("cantidad de jugadores de "+nacionality+": "+quantity);
	}
	
}