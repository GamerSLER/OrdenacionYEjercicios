package Practicas;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        palabra = palabra.replace("a", "*")
                .replace("e", "*")
                .replace("i", "*")
                .replace("o", "*")
                .replace("u", "*");

        System.out.println("Palabra con vocales reemplazadas: " + palabra);
    }
}
