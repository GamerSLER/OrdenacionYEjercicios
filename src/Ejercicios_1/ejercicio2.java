package Ejercicios_1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce nombre 1 --> ");
        String nombre1 = sc.next();
        System.out.print("Introduce nombre 2 --> ");
        String nombre2 = sc.next();
        System.out.print("Introduce nombre 3 --> ");
        String nombre3 = sc.next();

        System.out.println(nombre1.toUpperCase());
        System.out.println(nombre2.toUpperCase());
        System.out.println(nombre3.toUpperCase()    );
    }
}
