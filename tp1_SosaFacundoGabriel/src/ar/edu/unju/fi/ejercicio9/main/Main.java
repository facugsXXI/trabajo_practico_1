package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos para el producto " + i + ":");

            Producto producto = new Producto();
            System.out.print("Nombre: ");
            producto.setNombre(scanner.nextLine());
            System.out.print("Código: ");
            producto.setCodigo(scanner.nextInt());
            System.out.print("Precio: ");
            producto.setPrecio(scanner.nextDouble());
            System.out.print("Descuento (%): ");
            producto.setDescuento(scanner.nextInt());
            System.out.println("\n Producto " + i + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            if(producto.getDescuento() > 0 && producto.getDescuento() <= 50) 
            	System.out.println("Precio con descuento: " + producto.calcularDescuento());
            
            
        }

        scanner.close();
	}

}
