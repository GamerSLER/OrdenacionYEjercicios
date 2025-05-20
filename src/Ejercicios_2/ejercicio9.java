package Ejercicios_2;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().trim();

        int ultimaPosicionEspacio = frase.lastIndexOf(" ");

        if (ultimaPosicionEspacio == -1) {
            System.out.println("Resultado: [frase vacía]");
        } else {
            String resultado = frase.substring(0, ultimaPosicionEspacio);
            System.out.println("Resultado: " + resultado);
        }

        sc.close();
    }
}
