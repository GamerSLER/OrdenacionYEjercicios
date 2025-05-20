package Ejercicios_1;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera palabra --> ");
        String primeraPalabra = sc.next();

        boolean continuar = true;

        while (continuar) {
            System.out.print("Introduce otra palabra --> ");
            String palabra = sc.next();

            if (palabra.equals(primeraPalabra)) {
                System.out.println(":o");
                continuar = false;
            }
        }
        sc.close();
    }
}
