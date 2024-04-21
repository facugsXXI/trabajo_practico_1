package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;

public class Jugador {

	private String name;
	private String surname;
	private LocalDate birthday;
	private String nacionality;
	private Double heigth;
	private Double weigth;
	private String position;
	
	public Jugador() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getNacionality() {
		return nacionality;
	}

	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}

	public Double getWeigth() {
		return weigth;
	}

	public void setWeigth(Double weigth) {
		this.weigth = weigth;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public int calculateAge() {
		return LocalDate.now().getYear() - this.birthday.getYear();
	}
	
	
	
}
