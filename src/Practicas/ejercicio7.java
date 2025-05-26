package Practicas;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce palabra: ");
        String palabra = sc.next();

        String palabraMayus = palabra.toUpperCase();
        String palabraMinus = palabra.toLowerCase();

        System.out.println("Mayúscula: " + palabraMayus);
        System.out.println("Minúscula: " + palabraMinus);
    }
}
