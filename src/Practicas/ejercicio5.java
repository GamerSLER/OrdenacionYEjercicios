package Practicas;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce palabra: ");
        String palabra = sc.next();

        System.out.print("¿Qué letra quieres eliminar? --> ");
        String letra = sc.next();

        if (letra.length() != 1) {
            System.out.println("Por favor, introduce solo una letra.");
            return;
        }

        palabra = palabra.replace(letra, "*");

        System.out.println("Resultado: " + palabra);
    }
}
