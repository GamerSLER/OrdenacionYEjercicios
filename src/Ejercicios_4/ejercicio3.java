package Ejercicios_4;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una letra: ");
        char c = sc.next().toLowerCase().charAt(0);

        if (!Character.isLetter(c)) {
            System.out.println("No es una letra.");
        } else if ("aeiou".indexOf(c) != -1) {
            System.out.println("Es una vocal.");
        } else {
            System.out.println("Es una consonante.");
        }
    }
}
