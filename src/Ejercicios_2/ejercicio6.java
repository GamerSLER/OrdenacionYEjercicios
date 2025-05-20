package Ejercicios_2;

import java.util.Scanner;

public class ejercicio6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        System.out.print("Introduce una sílaba: ");
        String silaba = sc.nextLine();

        if (palabra.startsWith(silaba)) {
            System.out.println("La palabra comienza con la sílaba.");
        } else {
            System.out.println("La palabra no comienza con la sílaba.");
        }
    }
}
