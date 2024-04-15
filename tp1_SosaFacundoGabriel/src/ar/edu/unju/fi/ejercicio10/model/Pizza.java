package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private double diametro;
	private double precio;
	private double area;
	private boolean ingredientesEspeciales;
	private final int INGREDIENTES_ESPECIALES20 = 500;
	private final int INGREDIENTES_ESPECIALES30 = 750;
	private final int INGREDIENTES_ESPECIALES40 = 1000;
	
	
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	public int getINGREDIENTES_ESPECIALES20() {
		return INGREDIENTES_ESPECIALES20;
	}
	public int getINGREDIENTES_ESPECIALES30() {
		return INGREDIENTES_ESPECIALES30;
	}
	public int getINGREDIENTES_ESPECIALES40() {
		return INGREDIENTES_ESPECIALES40;
	}
	
	
	public void calcularPrecio() {
        if (diametro == 20.0) {
            precio = 4500.0;
            if (ingredientesEspeciales) {
                precio += INGREDIENTES_ESPECIALES20;
            }
        } else if (diametro == 30) {
            precio = 4800;
            if (ingredientesEspeciales) {
                precio += INGREDIENTES_ESPECIALES30;
            }
        } else if (diametro == 40) {
            precio = 5500;
            if (ingredientesEspeciales) {
                precio += INGREDIENTES_ESPECIALES40;
            }
        }
    }
	
	 public void calcularArea() {
	        double radio = diametro / 2.0;
	        area = Math.PI * Math.pow(radio, 2);
	    }
}
