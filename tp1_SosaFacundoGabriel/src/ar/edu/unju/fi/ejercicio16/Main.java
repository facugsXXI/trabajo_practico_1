package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
    	Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[5];

        System.out.println("Ingrese 5 nombres:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1)+ "º Nombre: ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("Nombres almacenados:");
        
        int j = 0;
        while (j < nombres.length) {
            System.out.println((j + 1) + "º Nombre: " + nombres[j]);
            j++;
        }

        System.out.println("Tamaño del arreglo: " + nombres.length);

        byte indice;
        
        do {
            System.out.println("Ingrese el índice del elemento a eliminar (0 - " + (nombres.length - 1) + "): ");
            indice = scanner.nextByte();
        } while (indice < 0 || indice >= nombres.length);

        for (int i = (int) indice; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        
        nombres[nombres.length - 1] = null;

        System.out.println("Arreglo después de eliminar el elemento:");
       
        for (String nombre : nombres) {
            if (nombre != null) {
                System.out.println(nombre);
            }
        }

        scanner.close();
    }
}
