package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos de la Pizza " + i);

            Pizza pizza = new Pizza();
            
            boolean diametroCorrecto = false;
            do {
            	System.out.print("Diámetro (20, 30, 40): ");
            	double diametro = scanner.nextDouble();
            	if (diametro == 30 || diametro == 30 || diametro == 40) {
            		pizza.setDiametro(diametro);
            		diametroCorrecto = true;}
            	else
            		System.out.println("El diametro ingresado no es el correcto.");
            }while (diametroCorrecto == false);
            
            boolean ingredientesEspeciales = false;
            String respuesta;
            do {
            	System.out.print("Ingredientes especiales (true/false): ");
            	respuesta = scanner.nextLine();
            	if(respuesta.equals("true")) {
            		ingredientesEspeciales = true;
            		pizza.setIngredientesEspeciales(ingredientesEspeciales);
            		respuesta = "salida";
            	}
            	else if (respuesta.equals("false")){
            		ingredientesEspeciales = false;
            		pizza.setIngredientesEspeciales(ingredientesEspeciales);
            		respuesta = "salida";
            	}
            	else
            		System.out.println("Respuesta incorrecta. Intente de nuevo");
            }while(respuesta != "salida");

            pizza.calcularPrecio();
            pizza.calcularArea();

            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizza.getArea());
        }

        scanner.close();

	}

}
