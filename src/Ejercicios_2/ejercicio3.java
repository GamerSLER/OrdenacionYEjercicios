package Ejercicios_2;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos nombres tienes? --> ");
        String rpta = sc.nextLine();

        String nombre1;
        String nombre2;
        String apellido1;
        String apellido2;
        String nombreCompleto;

        if (rpta.equals("2")) {
            System.out.print("Introduce el primer nombre: ");
            nombre1 = sc.nextLine();

            System.out.print("Introduce el segundo nombre: ");
            nombre2 = sc.nextLine();

            System.out.print("Introduce el primer apellido: ");
            apellido1 = sc.nextLine();

            System.out.print("Introduce el segundo apellido: ");
            apellido2 = sc.nextLine();

            nombreCompleto = nombre1.concat(" ").concat(nombre2).concat(" ").concat(apellido1).concat(" ").concat(apellido2);

            System.out.println("Nombre completo: " + nombreCompleto);

        } else if (rpta.equals("1")) {
            System.out.print("Introduce el nombre: ");
            nombre1 = sc.nextLine();

            System.out.print("Introduce el primer apellido: ");
            apellido1 = sc.nextLine();

            System.out.print("Introduce el segundo apellido: ");
            apellido2 = sc.nextLine();

            nombreCompleto = nombre1.concat(" ").concat(apellido1).concat(" ").concat(apellido2);

            System.out.println("Nombre completo: " + nombreCompleto);
        } else {
            System.out.println("Este programa tiene como máximo 2 nombres para introducir.");
        }
    }
}
