package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {

	private String code;
	private String name;
	private Double price;
	private Pais country;
	private Integer daysAmount;
	
	public DestinoTuristico() {}

	public DestinoTuristico(String code, String name, Double price, Pais country, Integer daysAmount) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.country = country;
		this.daysAmount = daysAmount;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Pais getCountry() {
		return country;
	}

	public void setCountry(Pais country) {
		this.country = country;
	}

	public Integer getDaysAmount() {
		return daysAmount;
	}

	public void setDaysAmount(Integer daysAmount) {
		this.daysAmount = daysAmount;
	}
	
	
}