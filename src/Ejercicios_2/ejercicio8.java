package Ejercicios_2;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        int contadorLetras = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                contadorLetras++;
            }
        }

        System.out.println("La frase tiene " + contadorLetras + " letras.");
    }
}

